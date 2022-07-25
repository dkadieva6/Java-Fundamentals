package FinalExam;

import java.util.Scanner;

public class P01StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commandArr = input.split("\\s+");
            String command = commandArr[0];

            switch (command) {
                case "Translate":
                    String charStr = commandArr[1];
                    String replacement = commandArr[2];

                    text = text.replace(charStr, replacement);
                    System.out.println(text);
                    break;

                case "Includes":
                    String substr = commandArr[1];

                    if (text.contains(substr)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Start":
                    String substrPart = commandArr[1];

                    if (text.startsWith(substrPart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "Lowercase":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;

                case "FindIndex":
                    String str = commandArr[1];
                    int findIndex = -1;

                    findIndex = text.lastIndexOf(str);
                    System.out.println(findIndex);
                    break;

                case "Remove":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int count = Integer.parseInt(commandArr[2]);

                    String replacedStr = text.substring(startIndex, count + startIndex);
                    text = text.replace(replacedStr, "");
                    System.out.println(text);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
