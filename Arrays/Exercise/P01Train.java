package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPeople = 0;
        int wagons = Integer.parseInt(scanner.nextLine());
        int [] train = new int [wagons];

        int allPeople = 0;
        for (int i = 0; i < train.length; i++) {
            train [i] = Integer.parseInt(scanner.nextLine());
            allPeople += train[i];
            System.out.print(train[i] + " ");
        }

        //Arrays.stream(train).forEach(wagons -> System.out.print(wagons + " "));
        System.out.printf("\n%s", allPeople);
    }
}
