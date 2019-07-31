package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab6Students2 {
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

            String firstName = std[0];
            String lastName = std[1];
            int age = Integer.parseInt(std[2]);
            String city = std[3];
            if (!Students.isEmpty()) {
                for (Student student : Students) {
                    if (student.firstName.equals(firstName) && student.lastName.equals(lastName)) {
                        Student existingStudent = Students.stream()
                                .filter(e -> e.firstName.equals(std[0]) && e.lastName.equals(std[1])).findFirst().get();
                        existingStudent.setAge(age);
                        existingStudent.setCity(city);
                        break;
                    } else {
                        Student newStudent = new Student();
                        newStudent.setFirstName(firstName);
                        newStudent.setLastName(lastName);
                        newStudent.setAge(age);
                        newStudent.setCity(city);
                        Students.add(newStudent);
                        break;
                    }
                }
            } else {
                Student newStudent = new Student();
                newStudent.setFirstName(firstName);
                newStudent.setLastName(lastName);
                newStudent.setAge(age);
                newStudent.setCity(city);
                Students.add(newStudent);
            }
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        Students.stream().filter(e -> e.getCity().equals(city))
                .forEach(n -> System.out.println
                        (String.format("%s %s is %d years old", n.getFirstName(), n.getLastName(), n.getAge())));


    }
}
