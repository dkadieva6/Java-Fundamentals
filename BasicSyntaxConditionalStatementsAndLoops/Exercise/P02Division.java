package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int max = 0;
        if (number % 2 == 0){
            max = 2;
        }

        if (number % 3 == 0){
            max = 3;
        }

        if (number % 6 == 0){
            max = 6;
        }

        if (number % 7 == 0){
            max = 7;
        }

        if (number % 10 == 0){
            max = 10;
        }

        if (max != 0){
            System.out.printf("The number is divisible by %d", max);
        } else {
            System.out.println("Not divisible");
        }
    }
}
