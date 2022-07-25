package Methods.MoreExercise;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] tribonacci = new int[Math.max(length, 3)];

        calculation(tribonacci);

        for (int i = 0; i < length; i++) {
            System.out.print(tribonacci[i] + " ");
        }
    }

    private static void calculation(int[] tribonacci) {
        tribonacci[0] = tribonacci[1] = 1;
        tribonacci[2] = 2;

        for (int i = 3; i < tribonacci.length; i++) {
            tribonacci[i] = tribonacci[i - 1] +
                            tribonacci[i - 2] +
                            tribonacci[i - 3];
        }
    }
}
