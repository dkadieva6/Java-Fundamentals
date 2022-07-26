package FinalExamPreparation.First;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        String command;
        while (!"Decode".equals(command = scanner.nextLine())) {
            String[] commandParts = command.split("\\|");
            String keyCommand = commandParts[0];

            switch (keyCommand) {
                case "Move":
                    int numOfLetters = Integer.parseInt(commandParts[1]);

                    stringBuilder.append(message, 0, numOfLetters);
                    message = message.substring(numOfLetters).concat(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    stringBuilder.append(message);
                    message = stringBuilder.insert(index, value).toString();
                    stringBuilder.setLength(0);
                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    if (message.contains(substring)) {
                        message = message.replace(substring, replacement);
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.printf("The decrypted message is: %s", message);
    }
}

/*
        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;

                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;

                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;

                default:
                    throw  new IllegalStateException("Unknown operation" + commandName + "in" + command);
            }

            message = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", message);
    }

    private static String move(String message, int length) {
        String firstPart = message.substring(0, length);
        String secondPart = message.substring(length);

        return secondPart + firstPart;
    }

    private static String insert(String message, int index, String substr) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);

        return firstPart + substr + secondPart;
    }

    private static String changeAll(String message, String substr, String replacement) {
        return message.replaceAll(substr, replacement);
    }
}
*/