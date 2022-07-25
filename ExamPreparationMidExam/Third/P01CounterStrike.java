package ExamPreparationMidExam.Third;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int wonGames = 0;
        int energy = initialEnergy;
        boolean isEnoughEnergy = true;
        while(!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy >= distance) {
                energy -= distance;
                wonGames++;
                if (wonGames % 3 == 0) {
                    energy += wonGames;
                }
            } else {
                isEnoughEnergy = false;
                System.out.printf("Not enough energy! Game ends with %d won battles and 0 energy", wonGames);
                break;
            }

            input = scanner.nextLine();
        }

        if (energy >= 0 && isEnoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d", wonGames, energy);
        }
    }
}
