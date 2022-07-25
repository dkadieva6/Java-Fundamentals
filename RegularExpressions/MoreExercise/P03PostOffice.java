package RegularExpressions.MoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        List<String> words = Arrays.stream(thirdPart.split("\\s+")).collect(Collectors.toList());
        String capitalLetters = "";
        Map<Integer, Integer> asciiMap = new HashMap<>();

        String regex = "[#$%*&][A-Z]+[#$%*&]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstPart);

        if (matcher.find()) {
            capitalLetters = matcher.group(0);
            if (capitalLetters.charAt(0) == capitalLetters.charAt(capitalLetters.length() - 1)) {
                capitalLetters = capitalLetters.substring(1, capitalLetters.length() - 1);
            }
        }

        if (capitalLetters.length() > 0) {
            for (int i = 0; i < capitalLetters.length(); i++) {
                asciiMap.putIfAbsent((int) capitalLetters.charAt(i), 0);
            }
        }

        if (asciiMap.size() > 0) {
            for (int i = 0; i < capitalLetters.length(); i++) {
                regex = String.format("(?<char>\\d+):(?<count>[0-9][1-9]|20|10)", (int) capitalLetters.charAt(i));
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(secondPart);

                while (matcher.find()) {
                    int symbol = Integer.parseInt(matcher.group("char"));
                    int count = Integer.parseInt(matcher.group("count"));
                    if (asciiMap.containsKey(symbol)) {
                        asciiMap.put(symbol, count + 1);
                    }
                }
            }
        }

        if (capitalLetters.length() > 0 && asciiMap.size() > 0) {
            for (int i = 0; i < capitalLetters.length(); i++) {
                for (String word : words) {
                    if (capitalLetters.charAt(i) == word.charAt(0)) {
                        if (asciiMap.get((int) capitalLetters.charAt(i)) == word.length()) {
                            System.out.println(word);
                        }
                    }
                }
            }
        }
    }
}



/*

package More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_v2 {

    private static void finalRegex(String input, char capitalLetter, int count) {
        String regex = String.format("(?<=\\s|^)(?<word>[%c][\\S]{%d})(?=\\s|$)", capitalLetter, count);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group("word"));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        String regex = "([#]|[$]|[%]|[*]|[&])[A-Z]+([#]|[$]|[%]|[*]|[&])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input[0]);

        if (matcher.find()) {
            if (matcher.group(0).charAt(0) == matcher.group(0).charAt(matcher.group(0).length() - 1)) {
                String upperCaseWord = matcher.group(0).substring(1, matcher.group(0).length() - 1);
                for (int i = 0; i < upperCaseWord.length(); i++) {
                    int asciiSymbol = upperCaseWord.charAt(i);
                    String secondRegex = String.format("(?<char>[%d][%d]):(?<count>[\\d][\\d])", ascciSymbol / 10, ascciSymbol % 10);
                    Pattern secondPattern = Pattern.compile(secondRegex);
                    Matcher secondMatcher = secondPattern.matcher(input[1]);
                    if (secondMatcher.find()){
                        finalRegex(input[2], (char) ascciSymbol, Integer.parseInt(secondMatcher.group("count")));
                    }
                }

            }
        }


    }
}

 */


/*

package More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        String regex = "([#]|[$]|[%]|[*]|[&])[A-Z]+([#]|[$]|[%]|[*]|[&])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input[0]);
        while (matcher.find()) {
            if (matcher.group(0).charAt(0) == matcher.group(0).charAt(matcher.group(0).length() - 1)) {
                String upperCaseWord = matcher.group(0).substring(1, matcher.group(0).length() - 1);
                for (int i = 0; i < upperCaseWord.length(); i++) {
                    int asciiSymbol = upperCaseWord.charAt(i);
                    String secondRegex = String.format("(?<char>%d):(?<count>[\\d][\\d])", ascciSymbol);
                    Pattern secondPattern = Pattern.compile(secondRegex);
                    Matcher secondMatcher = secondPattern.matcher(input[1]);
                    while (secondMatcher.find()) {
                        finalRegex(input[2], (char) ascciSymbol, Integer.parseInt(secondMatcher.group("count")));
                    }
                }

            }
        }

    }


    private static void finalRegex(String input, char capitalLetter, int count) {
        String regex = String.format("(?<=\\s|^)(?<word>[%c][\\S]{%d})(?=\\s|$)", capitalLetter, count);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group("word"));
        }
    }
}

 */