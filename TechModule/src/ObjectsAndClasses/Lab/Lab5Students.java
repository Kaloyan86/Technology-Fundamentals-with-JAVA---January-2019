package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Students {
    static class Student {
        String firstName;
        String lastName;
        int age;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        String city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayList<Student> Students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] std = input.split(" ");
            Student student = new Student();
            student.setFirstName(std[0]);
            student.setLastName(std[1]);
            student.setAge(Integer.parseInt(std[2]));
            student.setCity(std[3]);
            Students.add(student);

            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        Students.stream().filter(e -> e.getCity().equals(city))
                .forEach(n -> System.out.println
                        (String.format("%s %s is %d years old", n.getFirstName(), n.getLastName(), n.getAge())));


    }
}
