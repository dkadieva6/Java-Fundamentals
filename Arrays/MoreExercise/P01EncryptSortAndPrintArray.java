package Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int [numberOfStrings];

        //encrypt numbers
        for (int i = 0; i < numberOfStrings; i++) {
            String sequence = scanner.nextLine();
            int len = sequence.length();
            int sum = 0;

            for (int j = 0; j < sequence.length(); j++) {
                char currentChar = sequence.charAt(j);

                //check if Vowel or Constant
                if (isVowel(currentChar)) {
                    sum += currentChar * len;
                } else {
                    sum += currentChar / len;
                }
            }

            numbers [i] = sum;
        }

        //sort
        Arrays.sort(numbers);

        //print
        for (int element : numbers) {
            System.out.println(element);
        }
    }

    public static boolean isVowel (char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(c + "");
    }

    public static boolean isConsanant (char c) {
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(c + "");
    }
}
