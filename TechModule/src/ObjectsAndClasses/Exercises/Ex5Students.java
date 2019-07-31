package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Ex5Students {
    public static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

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

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",
                    this.firstName, this.lastName, this.getGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        while (n-- > 0) {
            String[] data = scanner.nextLine().split(" ");
            Student student = new Student(data[0], data[1], Double.parseDouble(data[2]));
            students.add(student);
        }
        students.stream().sorted((e1,e2)->Double.compare(e2.grade,e1.grade)).forEach(System.out::println);

    }

}
