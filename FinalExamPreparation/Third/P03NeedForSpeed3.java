package FinalExamPreparation.Third;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer[]> map = new TreeMap<>();
        int numberCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberCars; i++) {
            String[] tokens = scanner.nextLine().split("\\|");
            String car = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);

            map.putIfAbsent(car, new Integer[2]);
            map.get(car)[0] = mileage;
            map.get(car)[1] = fuel;
        }

        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] commands = line.split(" : ");
            String commandName = commands[0];
            String carName = commands[1];

            switch (commandName) {
                case "Drive":
                    int distance = Integer.parseInt(commands[2]);
                    int fuel = Integer.parseInt(commands[3]);

                    if (map.get(carName)[1] < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        map.get(carName)[0] += distance;
                        map.get(carName)[1] -= fuel;

                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, fuel);

                        if (map.get(carName)[0] > 100000) {
                            map.remove(carName);
                            System.out.printf("Time to sell the %s!%n", carName);
                        }
                    }
                    break;

                case "Refuel":
                    int fuelRefuel = Integer.parseInt(commands[2]);

                    if (map.get(carName)[1] + fuelRefuel > 75) {
                        fuelRefuel = 75 - map.get(carName)[1];
                        map.get(carName)[1] = 75;
                    } else {
                        map.get(carName)[1] += fuelRefuel;
                    }

                    System.out.printf("%s refueled with %d liters%n", carName, fuelRefuel);
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(commands[2]);

                    if (map.get(carName)[0] - kilometers >= 10000) {
                        map.get(carName)[0] -= kilometers;
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometers);
                    } else {
                        map.get(carName)[0] = 10000;
                    }
                    break;

                default:
                    break;
            }

            line = scanner.nextLine();
        }

        map.entrySet()
                .forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                        entry.getKey(), entry.getValue()[0], entry.getValue()[1]));
    }
}
