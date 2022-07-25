package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        //int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int counter = 1;
        int max = Integer.MIN_VALUE;
        int currentElement = numbers[0];
        for (int i = 1; i <= numbers.length - 1; i++) {
            if (numbers [i] == numbers [i - 1]) {
                counter++;

                if (counter > max) {
                    max = counter;
                    currentElement = numbers [i];
                }
            } else {
                counter = 1;
            }
        }

        for (int i = 0; i < max; i++) {
            System.out.print(currentElement + " ");
        }
    }
}
