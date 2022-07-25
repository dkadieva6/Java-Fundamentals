package Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            System.out.println(checkIsPalindrome(number));
            input = scanner.nextLine();
        }
    }

    public static boolean checkIsPalindrome(int number) {
        boolean result = false;
        int temp = number;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        if (reverse == temp) {
            result = true;
        }
        return result;
    }
}
/*
123
323
421
121
END

32
2
232
1010
END
 */