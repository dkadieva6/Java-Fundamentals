package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P02FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String leftNumString = "";
            String rightNumString = "";
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                count++;
                char digit = input.charAt(j);
                if (digit != ' ') {
                    leftNumString += digit;
                } else {
                    break;
                }
            }

            for (int k = count; k < input.length(); k++) {
                char digit = input.charAt(k);
                rightNumString += digit;
            }

            long leftNum = Long.parseLong(leftNumString);
            long rightNum = Long.parseLong(rightNumString);
            long maxNum = 0;
            if (leftNum > rightNum) {
                maxNum = Math.abs(leftNum);
            } else {
                maxNum = Math.abs(rightNum);
            }

            long sum = 0;
            while (maxNum > 0) {
                sum += maxNum % 10;
                maxNum /= 10;
            }

            System.out.println(sum);
        }
    }
}
