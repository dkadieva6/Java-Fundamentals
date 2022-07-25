package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";

        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        boolean isLogged = false;
        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            counter++;

            if (counter == 4 && !input.equals(password)){
                System.out.printf("User %s blocked!", username);
                break;
            }

            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        }
    }
}