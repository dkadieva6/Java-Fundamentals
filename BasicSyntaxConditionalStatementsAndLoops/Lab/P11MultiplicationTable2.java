package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());

        int result = 0;
        for (int i = num; i <= 10; i++){
            result = n * i;
            System.out.printf("%d X %d = %d", n, i, result);
            System.out.println();
            result = 0;
        }
        if (num > 10){
            result = n * num;
            System.out.printf("%d X %d = %d", n, num, result);
        }
    }
}
