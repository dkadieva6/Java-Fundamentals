package Methods.MoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            printMultiplicationBy2(number);
        } else if (input.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            printMultiplicationBy1Dot5(number);
        } else if (input.equals("string")) {
            String text = scanner.nextLine();
            printString(text);
        }
    }

    public static void printMultiplicationBy2 (int num) {
        System.out.println(num * 2);
    }

    public static void printMultiplicationBy1Dot5 (double num) {
        System.out.printf("%.2f", num * 1.5);
    }

    public static void printString (String text) {
        System.out.println("$" + text + "$");
    }
}
