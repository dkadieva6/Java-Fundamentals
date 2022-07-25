package ExamPreparationMidExam.Second;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        // students per hour = 15
        // 1h: 45 - 6 = 39
        // 2h: 39 - 6 = 33
        // 3h: 33 - 6 = 27
        // 4h: 27 - 0 = 27
        // 5h: 27 - 6 = 21
        // 6h: 21 - 6 = 15
        // 7h: 15 - 6 = 9
        // 8h: 9 - 0 = 9
        // 9h: 9 - 6 = 3
        // 10h: 3 - 5 = 0;

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;
        int remainingStudents = Integer.parseInt(scanner.nextLine());

        int hoursPassed = 0;
        while (remainingStudents > 0) {
            hoursPassed++;
            if (hoursPassed % 4 != 0) {
                remainingStudents -= studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hoursPassed);
    }
}
