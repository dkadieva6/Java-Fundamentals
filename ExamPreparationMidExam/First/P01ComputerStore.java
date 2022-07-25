package ExamPreparationMidExam.First;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String client = scanner.nextLine();

        double sum = 0;

        while(!client.equals("regular") || !client.equals("special")) {
            if (client.equals("regular") || client.equals("special")) {
                break;
            }
            double price = Double.parseDouble(client);

            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                sum += price;
            }

            client = scanner.nextLine();
        }

        double tax = sum * 20/100;
        double total = sum + tax;


        if (total == 0) {
            System.out.println("Invalid order!");
        } else if (client.equals("special")) {
            total = total * (0.9);
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        } else if (client.equals("regular")) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sum);
            System.out.printf("Taxes: %.2f$%n", tax);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
