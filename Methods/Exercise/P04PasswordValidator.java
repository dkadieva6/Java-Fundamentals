package Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (passLengthValidation(password) && isConsistOnlyLettersAndDigits(password) && hasAtLeast2Digits(password)) {
            System.out.println("Password is valid");
        }

        if (!passLengthValidation(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!hasAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean passLengthValidation (String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isConsistOnlyLettersAndDigits (String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasAtLeast2Digits (String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
