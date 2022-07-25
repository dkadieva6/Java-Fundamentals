package Arrays.Lab;

import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        String[] elements = inputLine.split(" ");

        int[] numbers = new int[elements.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        while (numbers.length > 1) {
            int [] condensed = new int [numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed [i] = numbers [i] + numbers [i + 1];
            }

            numbers = condensed;
        }

        System.out.println(numbers [0]);
    }
}
