package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int [] numArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxNumber = 0;

        for (int i = 0; i < numArr.length; i++) {
            boolean isBigger = false;
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr [i] > numArr [j]) {
                    maxNumber = numArr [i];
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger && maxNumber != 0) {
                System.out.print(maxNumber + " ");
            }
        }

        System.out.print(numArr [numArr.length - 1]);
    }
}
