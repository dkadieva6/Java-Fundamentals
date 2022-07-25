package FinalExamPreparation.Forth;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            String commandName = commands[0];

            switch (commandName) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();

                    for (int i = 1; i < password.length(); i += 2) {
                        newPassword.append(password.charAt(i));
                    }

                    password = newPassword.toString();
                    System.out.println(password);
                    break;

                case "Cut":
                    int index = Integer.parseInt(commands[1]);
                    int length = index + Integer.parseInt(commands[2]);

                    password = new StringBuilder(password).delete(index, length).toString();
                    System.out.println(password);
                    break;

                case "Substitute":
                    String str = commands[1];
                    String replacement = commands[2];

                    if (password.contains(str)) {
                        password = password.replace(str, replacement);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);
    }
}
