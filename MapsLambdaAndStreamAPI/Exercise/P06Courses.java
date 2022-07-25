package MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> course = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end")) {
            String[] splitCommand = command.split(" : ");
            String courseName = splitCommand[0];
            String user = splitCommand[1];

            if (!course.containsKey(courseName)) {
                course.put(courseName, new ArrayList<>());
                course.get(courseName).add(user);
            } else {
                if (!course.get(courseName).contains(user)) {
                    course.get(courseName).add(user);
                }
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry: course.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            entry.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
        }

    }
}
