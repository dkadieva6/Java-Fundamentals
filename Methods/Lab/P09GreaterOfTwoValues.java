package Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int result = getMax (firstNum, secondNum);
                System.out.println(result);
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                char greaterSymbol = getMax  (firstSymbol, secondSymbol);
                System.out.println(greaterSymbol);
                break;
            case "string":
                String firstWord = scanner.nextLine();
                String secondWord = scanner.nextLine();
                String greaterWord = getMax (firstWord, secondWord);
                System.out.println(greaterWord);
                break;
        }
    }

    private static int getMax (int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }

    private static char getMax (char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        }

        return secondSymbol;
    }

    private  static String getMax (String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) >= 0) {
            return firstWord;
        }

        return secondWord;
    }
}
