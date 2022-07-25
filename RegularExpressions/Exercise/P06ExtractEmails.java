package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "(?<=\\s)[A-Za-z]+([-.]\\w+)*@[A-Za-z]+?([-.][A-Za-z]*)*(\\.[a-z]{2,})";

//      String regex = "[A-Za-z]+([-.]\\w+)*@[A-Za-z]+?([-.][A-Za-z]*)*(\\.[a-z]{2,})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
