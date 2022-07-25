package ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04Articles2 {
    static class Article {

        private String getTitle() {
            return title;
        }

        private String getContent() {
            return content;
        }

        private String getAuthor() {
            return author;
        }

        String title;
        String content;
        String author;

        private Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }

        String command = scanner.nextLine();
        if (command.equals("title")) {
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("content")) {
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
