package FinalExamPreparation.Forth;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^@#+(?=[A-Z])(?<barcode>[A-Za-z0-9]{6,})(?<=[A-Z])@#+$";
        Pattern pattern = Pattern.compile(regex);

        int steps = Integer.parseInt(scanner.nextLine());
        while (steps-- > 0) {
            Matcher matcher = pattern.matcher(scanner.nextLine());

            if (matcher.find()) {
                matcher = Pattern.compile("\\d").matcher(matcher.group());
                System.out.print("Product group: ");

                if (matcher.find()) {
                    System.out.print(matcher.group());
                    while (matcher.find()) {
                        System.out.print(matcher.group());
                    }
                } else {
                    System.out.print("00");
                }
                System.out.println();
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
