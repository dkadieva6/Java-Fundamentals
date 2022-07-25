package MidExam;

import java.util.Scanner;

public class P01CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double singleEggPrice = Double.parseDouble(scanner.nextLine());
        double singleApronPrice = Double.parseDouble(scanner.nextLine());

        int freePackages = students / 5;
        double total = singleApronPrice * (Math.ceil(students * 1.20)) + (singleEggPrice * 10) * (students) + flourPrice * (students - freePackages);

        if (budget < total) {
            System.out.printf("%.2f$ more needed.", total - budget);
        } else {
            System.out.printf("Items purchased for %.2f$.", total);
        }
    }
}
