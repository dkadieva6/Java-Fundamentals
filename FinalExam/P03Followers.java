package FinalExam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P03Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> followers = new LinkedHashMap<>();

        String lines = scanner.nextLine();
        while (!lines.equals("Log out")) {
            String[] commandArr = lines.split(": ");
            String command = commandArr[0];
            String username = commandArr[1];

            switch (command) {
                case "New follower":
                    followers.putIfAbsent(username, 0);
                    break;

                case "Like":
                    int countLikes = Integer.parseInt(commandArr[2]);

                    if (!followers.containsKey(username)) {
                        followers.put(username, countLikes);
                    } else {
                        followers.put(username, followers.get(username) + countLikes);
                    }
                    break;

                case "Comment":
                    if (!followers.containsKey(username)) {
                        followers.put(username, 1);
                    } else {
                        followers.put(username, followers.get(username) + 1);
                    }
                    break;

                case "Blocked":
                    String blockedUser = commandArr[1];

                    if (!followers.containsKey(username)) {
                        System.out.printf("%s doesn't exist.%n", blockedUser);
                    } else {
                        followers.remove(username);
                    }
                    break;
            }

            lines = scanner.nextLine();
        }

        System.out.printf("%d followers%n", followers.size());
        followers.entrySet()
                .forEach(follow -> System.out.printf("%s: %d%n", follow.getKey(), follow.getValue()));
    }
}
