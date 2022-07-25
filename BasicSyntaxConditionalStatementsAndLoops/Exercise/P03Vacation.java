package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double singlePrice = 0.0;
        double totalPrice = 0.0;

        switch (typeOfGroup) {
            case "Students":
                if (day.equals("Friday")){
                    singlePrice = 8.45;
                } else if (day.equals("Saturday")){
                    singlePrice = 9.80;
                } else if (day. equals("Sunday")){
                    singlePrice = 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    singlePrice = 10.90;
                } else if (day.equals("Saturday")){
                    singlePrice = 15.60;
                } else if (day. equals("Sunday")){
                    singlePrice = 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    singlePrice = 15;
                } else if (day.equals("Saturday")){
                    singlePrice = 20;
                } else if (day. equals("Sunday")){
                    singlePrice = 22.50;
                }
                break;
        }

        totalPrice = students * singlePrice;

        if (students >= 30 && typeOfGroup.equals("Students")){
            totalPrice *= 0.85;
        }

        if (students >= 100 && typeOfGroup.equals("Business")){
            totalPrice = (students - 10) * singlePrice;
        }

        if (students >= 10 && students <= 20 && typeOfGroup.equals("Regular")){
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
