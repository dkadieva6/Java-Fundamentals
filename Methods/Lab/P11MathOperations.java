package Methods.Lab;

import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculate(a, operator, b);
        System.out.printf("%.0f", result);
    }

    private static double calculate (int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = divide(a, b);
                break;
            case "*":
                result = multiply(a, b);
                break;
            case "+":
                result = add(a, b);
                break;
            case "-":
                result = subtract(a, b);
                break;
        }

        return result;
    }

    public static int add (int a, int b) {
        return a + b;
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static int subtract (int a, int b) {
        return a - b;
    }

    public static int divide (int a, int b) {
        return a / b;
    }
}
