package Methods.MoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        ResultSign(a, b, c);
    }

    private static void ResultSign(double a, double b, double c) {
        if (a == 0 || b == 0 ||  c == 0) {
            System.out.println("zero");
        } else if ((a > 0 && b > 0 && c > 0) || (a < 0 && b < 0 && c > 0) ||
                (a < 0 && b > 0 && c < 0) || (a > 0 && b < 0 && c < 0)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
