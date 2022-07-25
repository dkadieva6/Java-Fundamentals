package Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getMultiplyOfEvenAndOdds (number);
        System.out.println(result);
    }

    private static int getMultiplyOfEvenAndOdds (int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits (int number) {
        int evensSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0){
                evensSum += digit;
            }
            number /= 10;
        }

        return evensSum;
    }

    private static int getSumOfOddDigits (int number) {
        int oddsSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0){
                oddsSum += digit;
            }
            number /= 10;
        }

        return oddsSum;
    }
}
