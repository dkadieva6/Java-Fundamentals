package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = firstNum; i <= lastNum; i++){
            System.out.print(i);
            System.out.print(" ");
            sum += i;
        }

        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
