package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int currentNum = 1;
        for (int i = 0; i < n; i++){
            System.out.println(currentNum);
            sum += currentNum;
            currentNum += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
