package MapsLambdaAndStreamAPI.MoreExercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> contests = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] lines = input.split(" -> ");
            String nameStudent = lines[0];
            String nameContest = lines[1];
            int points = Integer.parseInt(lines[2]);

            if (!contests.containsKey(nameContest)) {
                contests.put(nameContest, new LinkedHashMap<>());
                contests.get(nameContest).put(nameStudent, points);
            } else {
                if (contests.get(nameContest).containsKey(nameStudent)) {
                    if (contests.get(nameContest).get(nameStudent) < points) {
                        contests.get(nameContest).put(nameStudent, points);
                    }
                } else {
                    contests.get(nameContest).put(nameStudent, points);
                }
            }

            input = scanner.nextLine();
        }
        AtomicInteger num = new AtomicInteger();

        contests.entrySet().stream()
                .forEach((p) -> {
                    System.out.printf("%s: %d participants%n", p.getKey(), p.getValue().size());
                    num.set(1);
                    Map<String, Integer> students = new HashMap<>();
                    students = p.getValue();
                    students.entrySet().stream()
                            .sorted((e1, e2) -> {
                                if (e2.getValue() == e1.getValue()) {
                                    return e1.getKey().compareTo(e2.getKey());
                                } else {
                                    return e2.getValue() - e1.getValue();
                                }
                            })
                            .forEach((s) -> {
                                System.out.printf("%d. %s <::> %d%n", num.getAndIncrement(), s.getKey(), s.getValue());
                            });

                });


        Map<String, Integer> standings = new LinkedHashMap<>();

        for(Map.Entry<String, Map<String, Integer>> entry : contests.entrySet()) {
            for (Map.Entry<String, Integer> qwer : entry.getValue().entrySet()) {
                standings.putIfAbsent(qwer.getKey(), 0);
                standings.put(qwer.getKey(), standings.get(qwer.getKey()) + qwer.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;
        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });

    }
}