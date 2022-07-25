package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class P05DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            char check = input.charAt(0);

            int ascii = (int) check + key;
            char currentChar = (char) ascii;

            output += currentChar;
        }
        System.out.println(output);
    }
}
