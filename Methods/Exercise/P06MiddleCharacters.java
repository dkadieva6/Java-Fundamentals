package Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter (String text) {
        if (text.length() % 2 == 0) {
            //3245
            System.out.print(text.charAt(text.length() / 2 - 1));
            System.out.print(text.charAt(text.length() / 2));
        } else {
            // aString 7 / 2 = 3
            System.out.print(text.charAt(text.length() / 2));
        }
    }

}
