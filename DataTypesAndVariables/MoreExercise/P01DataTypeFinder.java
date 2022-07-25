package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("END")) {

            boolean isInt = scanner.hasNextInt();
            boolean isDouble = scanner.hasNextDouble();
            boolean isBool = scanner.hasNextBoolean();
            boolean isString = true;
            String temp = scanner.nextLine();

            if (isInt) {
                System.out.println(temp + " is integer type");
                isString = false;
            } else if (isBool) {
                System.out.println(temp + " is boolean type");
                isString = false;
            } else if (isDouble) {
                System.out.println(temp + " is floating point type");
                isString = false;
            }

            if (temp.length() == 1 && isString) {
                System.out.println(temp + " is character type");
            } else if (isString) {
                System.out.println(temp + " is string type");
            }
        }
    }
}