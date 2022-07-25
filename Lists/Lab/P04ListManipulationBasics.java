package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String [] token = inputLine.split(" ");

            switch (token[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(token[1]);
                    numbers.add(numberToAdd);
                    break;

                case "Remove":
                    int numberToRemove = Integer.parseInt(token[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;

                case "RemoveAt":
                    int indexToRemoveAt = Integer.parseInt(token[1]);
                    numbers.remove(indexToRemoveAt);
                    break;

                case "Insert":
                    int numberToInsert = Integer.parseInt(token[1]);
                    int indexToInsert = Integer.parseInt(token[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }

            inputLine = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
