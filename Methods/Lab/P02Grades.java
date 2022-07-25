package Methods.Lab;

import java.util.Scanner;

public class P02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* double grade = Double.parseDouble(scanner.nextLine());
           printInWords(grade);
         */

        printInWords(Double.parseDouble(scanner.nextLine()));
    }

    public static void printInWords (double grade) {
        String gradeInWords = "";
        if (grade >= 2.00 && grade <= 2.99) {
            gradeInWords = "Fail";
        } else if (grade <= 3.49) {
            gradeInWords = "Poor";
        } else if (grade <= 4.49) {
            gradeInWords = "Good";
        } else if (grade <= 5.49) {
            gradeInWords = "Very good";
        } else if (grade <= 6.00) {
            gradeInWords = "Excellent";
        }

        System.out.println(gradeInWords);
    }
}
