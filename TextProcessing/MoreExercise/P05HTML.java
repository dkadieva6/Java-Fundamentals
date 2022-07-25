package TextProcessing.MoreExercise;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String content = scanner.nextLine();

        String input = scanner.nextLine();
        System.out.println("<h1>");
        System.out.printf("    %s%n",title);
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.printf("    %s%n",content);
        System.out.println("</article>");

        while (!input.equals("end of comments")) {
            String comments = input;
            System.out.println("<div>");
            System.out.printf("    %s%n",comments);
            System.out.println("</div>");

            input = scanner.nextLine();
        }
    }
}