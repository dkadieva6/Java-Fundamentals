package Arrays.Lab;

import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine1 = scanner.nextLine();
        String inputLine2 = scanner.nextLine();

        String [] elements1 = inputLine1.split(" ");
        String [] elements2 = inputLine2.split(" ");

        int [] firstArr = new int[elements1.length];
        int [] secondArr = new int[elements2.length];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = Integer.parseInt(elements1[i]);
        }

        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = Integer.parseInt(elements2[i]);
        }

        int sum = 0;
       int counter = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
                counter++;
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if (counter == firstArr.length) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
