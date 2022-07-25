package RegularExpressions.MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("@([A-Za-z]+)[^@\\-!:>]*!([A-Z])!");

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String decrypt = "";

            for (int i = 0; i < input.length(); i++) {
                int ascii = (int) input.charAt(i) - n;
                decrypt += (char) ascii;
            }

            Matcher matcher = pattern.matcher(decrypt);

            while (matcher.find()) {
                String behavior = matcher.group(2);

                if (behavior.equals("G")) {
                    String name = matcher.group(1);
                    System.out.println(name);
                }
            }

            input = scanner.nextLine();
        }
    }
}