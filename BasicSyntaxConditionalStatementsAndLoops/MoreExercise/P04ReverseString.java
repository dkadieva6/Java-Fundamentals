package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reverseString += input.charAt(i);
        }

        System.out.println(reverseString);
    }
}
