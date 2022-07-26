package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!key.equals("stop")) {
            int quality = Integer.parseInt(scanner.nextLine());

            resources.putIfAbsent(key, 0);
            resources.put(key, resources.get(key) + quality);

            key = scanner.nextLine();
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
