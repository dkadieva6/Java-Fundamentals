package ObjectsAndClasses.Exercise;

import java.util.*;

public class P03OpinionPoll {
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.add(person);

            if (Integer.parseInt(data[1]) > 30) {
                System.out.printf("%s - %d%n", data[0], Integer.parseInt(data[1]));
            }
        }
    }
}