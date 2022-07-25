package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "!(?<command>[A-Z][a-z]{3,})!:[\\[](?<valid>[A-Za-z]{8,})[\\]]";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine();
            Matcher matcher = pattern.matcher(string);

            if (!matcher.find()) {
                System.out.println("The message is invalid");
            } else {
                System.out.print(matcher.group("command") + ": ");
                String text = matcher.group("valid");

                List<String> translate = new ArrayList<>();
                for (int j = 0; j < text.length(); j++) {
                    int ascii = text.charAt(j);
                    String newString = String.valueOf(ascii);
                    translate.add(newString);
                }

                System.out.println(String.join(" ", translate));
            }
        }
    }
}
