package Lists.Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultNumbers = new ArrayList<>();
        if (numbers1.size() < numbers2.size()) {
            for (int i = 0; i < numbers1.size(); i++) {
                resultNumbers.add(numbers1.get(i));
                resultNumbers.add(numbers2.get(i));
            }

            for (int i = numbers1.size(); i < numbers2.size(); i++) {
                resultNumbers.add(numbers2.get(i));
            }
        } else if (numbers2.size() < numbers1.size()) {
            for (int i = 0; i < numbers2.size(); i++) {
                resultNumbers.add(numbers1.get(i));
                resultNumbers.add(numbers2.get(i));
            }

            for (int i = numbers2.size(); i < numbers1.size(); i++) {
                resultNumbers.add(numbers1.get(i));
            }
        } else {
            for (int i = 0; i < numbers1.size(); i++) {
                resultNumbers.add(numbers1.get(i));
                resultNumbers.add(numbers2.get(i));
            }
        }

        for (int j = 0; j < resultNumbers.size(); j++) {
            System.out.print(new DecimalFormat("0.###").format(resultNumbers.get(j)) + " ");
        }
    }
}
