package FinalExamPreparation.First;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String regex = "(?<symbol>[\\|#])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})\\1(?<calories>[\\d]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> items = new LinkedList<>();

        int totalCalories = 0;
        while (matcher.find()) {
            String nameOfItem = matcher.group("name");
            String expirationDate = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", nameOfItem, expirationDate, calories));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories/2000);
        for (String item : items) {
            System.out.print(item);
        }

    }
}
