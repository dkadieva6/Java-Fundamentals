package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P08LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        int asciiChar = (int) character;

        if (asciiChar >= 64 && asciiChar <= 90) {
            System.out.println("upper-case");
        } else if (asciiChar >= 97 && asciiChar <= 122) {
            System.out.println("lower-case");
        }
    }
}
