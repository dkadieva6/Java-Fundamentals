package BasicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double gamePrice = 0.0;
        double totalMoneySpend = 0.0;
        boolean isOutOfMoney = false;
        while (!input.equals("Game Time")) {
            String boughtGame = input;

            switch (boughtGame) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
            }

            if (gamePrice != 0.0 && gamePrice <= currentBalance){
                System.out.printf("Bought %s%n", boughtGame);
                currentBalance -= gamePrice;
                totalMoneySpend += gamePrice;
            } else if (gamePrice > currentBalance) {
                System.out.println("Too Expensive");
            }

            if (currentBalance <= 0) {
                System.out.println("Out of money!");
                isOutOfMoney = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (!isOutOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalMoneySpend, currentBalance);
        }
    }
}
