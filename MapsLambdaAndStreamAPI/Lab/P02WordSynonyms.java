package MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPairs = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 1; i <= numberPairs; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            List<String> currentSynonyms = words.get(word);

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey().toString().replace("[", "").replace("]",""), entry.getValue().toString().replace("[", "").replace("]",""));
        }
    }
}
