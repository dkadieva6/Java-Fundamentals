package Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Reverse both lists in order to work from last to first with removal of elements, for better performance
        Collections.reverse(firstPlayer);
        Collections.reverse(secondPlayer);

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            int firstCard = firstPlayer.get(firstPlayer.size() - 1);
            int secondCard = secondPlayer.get(secondPlayer.size() - 1);

            if (firstCard > secondCard) {
                firstPlayer.add(0, firstCard);
                firstPlayer.add(0, secondCard);
            } else if (secondCard > firstCard) {
                secondPlayer.add(0, secondCard);
                secondPlayer.add(0, firstCard);
            }

            //Remove cards from both decks in any case
            firstPlayer.remove(firstPlayer.size() - 1);
            secondPlayer.remove(secondPlayer.size() - 1);
        }

        int sum = 0;
        String name = "";

        if (!firstPlayer.isEmpty()) {
            for (int card : firstPlayer) {
                sum += card;
            }
            name = "First";
        } else {
            for (int card : secondPlayer) {
                sum += card;
            }
            name = "Second";
        }

        System.out.printf("%s player wins! Sum: %d", name, sum);
    }
}
