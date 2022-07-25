package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            String currentLine = scanner.nextLine();
            int indexBeforeName = currentLine.indexOf('@');
            int indexAfterName = currentLine.indexOf('|');

            String name = currentLine.substring(indexBeforeName + 1, indexAfterName);

            int indexBeforeAge = currentLine.indexOf('#');
            int indexAfterAge = currentLine.indexOf('*');

            String age = currentLine.substring(indexBeforeAge + 1, indexAfterAge);

            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
