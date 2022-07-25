package ExamPreparationMidExam.Fifth;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        int maxAttendance = 0;
        for (int i = 1; i <= numberStudents; i++) {
            int attended = Integer.parseInt(scanner.nextLine());
            if (attended > maxAttendance) {
                maxAttendance = attended;
            }
        }

        double maxBonus = Math.ceil(((double)maxAttendance / numberLectures) * (5 + additionalBonus));
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendance);
    }
}
