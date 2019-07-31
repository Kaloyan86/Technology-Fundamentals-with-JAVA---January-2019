package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3OpinionPoll {
    public static class person {
        String name;
        int age;


        public person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.getName(), this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Ex3OpinionPoll.person> allPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

            person person = new person(data[0], Integer.parseInt(data[1]));

            allPersons.add(person);
        }
        allPersons
                .stream()
                .filter(e -> e.age > 30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);

    }
}
