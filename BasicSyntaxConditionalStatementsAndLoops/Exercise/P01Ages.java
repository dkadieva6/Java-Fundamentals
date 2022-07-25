package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        String person = "";
        if (age >= 0 && age < 3){
            person = "baby";
        } else if (age >= 3 && age < 14){
            person = "child";
        } else if (age >= 14 && age < 20){
            person = "teenager";
        } else if (age >= 20 && age < 66){
            person = "adult";
        } else if (age >= 66){
            person = "elder";
        }

        System.out.println(person);
    }
}
