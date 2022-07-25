package ExamPreparationMidExam.Forth;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverInGrams = Double.parseDouble(scanner.nextLine()) * 1000;
        double puppyWeihgtInGrams = Double.parseDouble(scanner.nextLine()) * 1000;

        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;
            if (i % 2 == 0) {
                hayInGrams -= 0.05 * foodInGrams;
            }
            if (i % 3 == 0) {
                coverInGrams -= puppyWeihgtInGrams / 3.0;
            }
            if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }
        }
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGrams / 1000, hayInGrams / 1000, coverInGrams / 1000);

    }
}

