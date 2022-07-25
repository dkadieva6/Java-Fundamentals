package ExamPreparationMidExam.First;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        String temp = scanner.nextLine();
        int[] lift = Arrays.stream(temp.split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < lift.length; i++) {
            if (waitingPeople == 0) {
                break;
            }

            if (lift[i] < 4) {
                if (waitingPeople - (4 - lift[i]) >= 0) {
                    waitingPeople -= 4 - lift[i];
                    lift[i] = 4;
                } else {
                    lift[i] += waitingPeople;
                    waitingPeople = 0;
                }
            }
        }

        if (waitingPeople == 0) {
            if (lift[lift.length - 1] < 4) {
                System.out.println("The lift has empty spots!");
            }

            for (int i : lift) {
                System.out.print(i + " ");
            }
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);

            for (int i : lift) {
                System.out.print(i + " ");
            }
        }

    }
}
