package RegularExpressions.Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phones = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher matcher = pattern.matcher(phones);

        List<String> matchedPhones = new LinkedList<>();

        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }

        System.out.println(String.join(", ", matchedPhones));
    }
}
