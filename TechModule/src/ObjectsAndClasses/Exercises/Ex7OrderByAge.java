package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex7OrderByAge {
    public static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(),getID(),getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("End")) {
            String[] data = input.split(" ");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            people.add(person);

            input = scanner.nextLine();
        }
        people.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);
    }
}