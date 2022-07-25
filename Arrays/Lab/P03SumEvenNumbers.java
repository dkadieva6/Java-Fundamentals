package Arrays.Lab;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineOfNumbers = scanner.nextLine();

        String [] numbersAsStrings = lineOfNumbers.split(" ");

        int [] numbers = new int [numbersAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}
