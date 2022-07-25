package TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }

        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }

        System.out.println();

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetterOrDigit(input.charAt(i))) {
                System.out.print(input.charAt(i));
            }
        }
    }
}
