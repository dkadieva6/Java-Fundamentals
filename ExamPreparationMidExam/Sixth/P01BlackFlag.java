package ExamPreparationMidExam.Sixth;

import java.util.Scanner;

public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int daysOfPlunder = Integer.parseInt(scan.nextLine());
        int plunderDaily = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());
        double plunderInThisMoment = 0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            plunderInThisMoment += plunderDaily;

            if (i % 3 == 0) {
                plunderInThisMoment += 0.5 * plunderDaily;
            }
            if (i % 5 == 0) {
                plunderInThisMoment = 0.7 * plunderInThisMoment;
            }
        }
        if (plunderInThisMoment >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderInThisMoment);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (plunderInThisMoment / expectedPlunder) * 100);
        }
    }
}
