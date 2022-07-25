package ExamPreparationMidExam.Third;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());


        String input=scanner.nextLine();

        while (!input.equals("End")){
            List<String> commandLine= Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String command= commandLine.get(0);

            switch (command){
                case "Shoot":
                    int shootIndex=Integer.parseInt(commandLine.get(1));
                    int power=Integer.parseInt(commandLine.get(2));

                    if(shootIndex<targetsList.size() && shootIndex>=0){
                        int currentNumOfIndex=targetsList.get(shootIndex);
                        int sum=currentNumOfIndex-power;
                        targetsList.set(shootIndex,sum);
                        if(sum<=0){
                            targetsList.remove(shootIndex);
                        }
                    }
                    break;
                case "Add":
                    int addIndex=Integer.parseInt(commandLine.get(1));
                    int value=Integer.parseInt(commandLine.get(2));
                    if(addIndex<targetsList.size() && addIndex>=0){
                        targetsList.add(addIndex,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int strikeIndex=Integer.parseInt(commandLine.get(1));
                    int radius=Integer.parseInt(commandLine.get(2));

                    int start=strikeIndex - radius;
                    int end=strikeIndex + radius;

                    if(start<0  ||  end>targetsList.size()){
                        System.out.println("Strike missed!");
                    }else if(end >= start) {
                        targetsList.subList(start, end + 1).clear();
                    }
                    break;
            }



            input= scanner.nextLine();
        }


        for (int i = 0; i < targetsList.size(); i++) {
            if (i== targetsList.size()-1){
                System.out.print(targetsList.get(i));
            }else {System.out.print(targetsList.get(i)+"|");
            }
        }


    }

}