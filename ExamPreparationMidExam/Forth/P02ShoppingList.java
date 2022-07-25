package ExamPreparationMidExam.Forth;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays
                .stream(scan.nextLine().split("!"))
                .collect(Collectors.toList());
        String command = scan.nextLine();
        int itemCounter=0;
        while (!command.equals("Go Shopping!")) {
            String[] arrCommand = command.split(" ");
            switch (arrCommand[0]) {
                case ("Urgent"):
                    itemCounter = 0;
                    for (String item : items) {
                        if (arrCommand[1].equals(item)) {
                            itemCounter++;
                        }
                    }
                    if(itemCounter==0){
                        items.add(0, arrCommand[1]);
                    }
                    break;
                case "Unnecessary":
                    itemCounter=0;
                    for (String item : items) {
                        if (arrCommand[1].equals(item)) {
                            itemCounter++;
                        }
                    }
                    if(itemCounter>=1){
                        items.remove(arrCommand[1]);
                    }
                    break;
                case "Correct":
                    for (int i = 0; i < items.size(); i++) {
                        if (arrCommand[1].equals(items.get(i))) {
                            items.set(i, arrCommand[2]);
                        }
                    }
                    break;
                case "Rearrange":
                    for (int i = 0; i < items.size(); i++) {
                        if (arrCommand[1].equals(items.get(i))) {
                            items.remove(arrCommand[1]);
                            items.add(arrCommand[1]);
                        }
                    }
                    break;

            }
            command = scan.nextLine();
        }
        printingList(items, ", ");
    }


    static void printingList(List<String> item, String separator) {
        for (int i = 0; i < item.size(); i++) {
            System.out.print(item.get(i));
            if (i < item.size() - 1) {
                System.out.print(separator);
            }
        }
    }

}
