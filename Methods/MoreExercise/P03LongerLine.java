package Methods.MoreExercise;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());

        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        double lengthFirstLine = lineLength(x1, y1, x2, y2);
        double lengthSecondLine = lineLength(x3, y3, x4, y4);

        if (lengthFirstLine >= lengthSecondLine) {
            boolean isFirstCloser = closerPoint(x1, y1, x2, y2);
            if (isFirstCloser) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);
            }
        } else if (lengthFirstLine < lengthSecondLine) {
            boolean isFirstCloser = closerPoint(x3, y3, x4, y4);
            if (isFirstCloser) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            } else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            }
        }
    }

    private static double lineLength(double x1, double y1, double x2, double y2)
    {
        double lineLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lineLength;

    }

    private static boolean closerPoint(double x1, double y1, double x2, double y2) {
        double c1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double c2 = Math.sqrt((x2 * x2) + (y2 * y2));
        boolean closerOrNot = true;

        if (c1 < c2) {
            closerOrNot = true;
        } else if (c1 > c2) {
            closerOrNot = false;
        }

        return closerOrNot;
    }
}
