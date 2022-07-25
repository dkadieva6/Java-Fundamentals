package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());

        String output = "";
        for (int i = 1; i <= rows; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            int countDigits = 0;
            int mainDigit = number % 10;

            if (number == 0) {
                output += " ";
                continue;
            }
            while (number % 10 != 0) {
                countDigits++;
                number /= 10;
            }

            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }

            int letterIndex = (offset + countDigits - 1);
            output += (char)(letterIndex + 'a');
        }
        System.out.println(output);
    }
}
