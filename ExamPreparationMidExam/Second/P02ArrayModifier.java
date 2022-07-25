package ExamPreparationMidExam.Second;

import java.util.Arrays;
import java.util.Scanner;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] instructions = input.split(" ");
            String command = instructions[0];
            if (!command.equals("decrease")) {
                int index1 = Integer.parseInt(instructions[1]);
                int index2 = Integer.parseInt(instructions[2]);

                switch (command) {
                    case "swap":
                        int temp = array[index1];
                        array[index1] = array[index2];
                        array[index2] = temp;
                        break;
                    case "multiply":
                        array[index1] = array[index1] * array[index2];
                        break;
                }
            } else {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i] - 1;
                }
            }

            input = scanner.nextLine();
        }

        if (array.length >= 1) {
            System.out.print(array[0]);
        }

        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
    }
}
