package Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = Integer.parseInt(scanner.nextLine());
        long num2 = Integer.parseInt(scanner.nextLine());
        double factorialNum1 = findFactorial(num1);
        double factorialNum2 = findFactorial(num2);

        System.out.printf("%.2f", factorialNum1 / factorialNum2);
    }

    private static long findFactorial (long n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
