package ExamPreparationMidExam.Third;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String index = scanner.nextLine();
        int count = 0;

        while (!index.equals("End")) {
            int newIndex = Integer.parseInt(index);

            //if (newIndex > targets.size() - 1)
            if (newIndex < 0 || newIndex >= targets.size() || targets.get(newIndex) == -1) {
                index = scanner.nextLine();
                continue;
            }

            int oldValue = targets.get(newIndex);
            // int oldValue = targets.get(newIndex);
            // targets.remove(newIndex);
            // targets.insert(newIndex, -1);

            targets.set(newIndex, -1);
            count++;
            for (int i = 0; i < targets.size(); i++) {
                if (targets.get(i) == -1) {
                    continue;
                }

                if (oldValue < targets.get(i)) {
                    int newValue = targets.get(i) - oldValue;
                    targets.set(i, newValue);
                } else if (oldValue >= targets.get(i) && targets.get(i) != -1) {
                    int newValue = oldValue + targets.get(i);
                    targets.set(i, newValue);
                }
            }
            index = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", count);
        targets.forEach(el -> System.out.print(el + " "));
    }
}
