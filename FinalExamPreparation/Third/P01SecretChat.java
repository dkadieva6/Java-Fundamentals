package FinalExamPreparation.Third;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":\\|:");
            String instruction = tokens[0];

            switch (instruction) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);

                    concealedMessage = concealedMessage.substring(0, index)
                            + " " + concealedMessage.substring(index, concealedMessage.length());
                    System.out.println(concealedMessage);
                    break;

                case "Reverse":
                    String str = tokens[1];

                    if (concealedMessage.contains(str)) {
                        String replacement =  new StringBuilder(str).reverse().toString();

                        concealedMessage = concealedMessage.replaceFirst(Pattern.quote(str), "") + replacement;
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String string = tokens[1];
                    String replacement = tokens[2];

                    concealedMessage = concealedMessage.replace(string, replacement);
                    System.out.println(concealedMessage);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", concealedMessage);
    }
}
