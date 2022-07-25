package FinalExamPreparation.Fifth;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawGenerationKey = scanner.nextLine();

        String input = scanner.nextLine();
        String sub = "";
        while (!input.equalsIgnoreCase("Generate")){
            String[] splitedInput = input.split(">>>");
            String command = splitedInput[0];
            if (command.equalsIgnoreCase("Contains")){
                String substring = splitedInput[1];
                if (rawGenerationKey.contains(substring)){
                    System.out.printf("%s contains %s%n", rawGenerationKey,substring);
                }else{
                    System.out.printf("Substring not found!\n");
                }
            }else if (command.equalsIgnoreCase("Flip")){
                String direction = splitedInput[1];
                int startIndex = Integer.parseInt(splitedInput[2]);
                int endIndex = Integer.parseInt(splitedInput[3]);
                if (direction.equalsIgnoreCase("Upper")){
                    StringBuilder sb = new StringBuilder();
                    sb.append(rawGenerationKey);
                    sub = sb.substring(startIndex,endIndex);
                    sub = sub.toUpperCase();
                    sb.replace(startIndex,endIndex, sub);
                    rawGenerationKey = sb.toString();
                    sb.setLength(0);
                    System.out.println(rawGenerationKey);
                }else if (direction.equalsIgnoreCase("Lower")){
                    StringBuilder sb = new StringBuilder();
                    sb.append(rawGenerationKey);
                    sub = sb.substring(startIndex,endIndex);
                    sub = sub.toLowerCase();
                    sb.replace(startIndex,endIndex, sub);
                    rawGenerationKey = sb.toString();
                    sb.setLength(0);
                    System.out.println(rawGenerationKey);
                }
            }else if (command.equalsIgnoreCase("Slice")){
                int startIndex = Integer.parseInt(splitedInput[1]);
                int endIndex = Integer.parseInt(splitedInput[2]);
                StringBuilder sb = new StringBuilder();
                sb.append(rawGenerationKey);
                sb.replace(startIndex,endIndex,"");
                rawGenerationKey = sb.toString();
                sb.setLength(0);
                System.out.println(rawGenerationKey);

            }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", rawGenerationKey);
    }
}