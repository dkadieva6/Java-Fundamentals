package Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(findSmallestNumber (a, b, c));
    }

    private static int findSmallestNumber (int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);

        /*
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers [i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - 1 - i] = temp;
        }
         */

        return numbers[0];
    }
}
