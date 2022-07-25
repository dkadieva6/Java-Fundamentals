package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabers = Double.parseDouble(scanner.nextLine());
        double robers = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        //George Lucas should buy 10% more, rounded up to the next integer.
        //Also, every sixth belt is free.

        double saberCount = Math.ceil(students * 1.10);
        int beltCount = students - students / 6;

        double totalMoney = sabers * saberCount + robers * students + belts * beltCount;

        if (totalMoney <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalMoney - money);
        }
    }
}
