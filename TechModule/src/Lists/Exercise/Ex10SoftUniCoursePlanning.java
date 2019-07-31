package Lists.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!"course start".equalsIgnoreCase(input)) {
            String[] command = input.split(":");

            switch (command[0]) {
                case "Add":
                    if (!schedule.contains(command[1])) {
                        schedule.add(command[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!schedule.contains(command[1]) && index >= 0 && index < schedule.size()) {
                        schedule.add(Integer.parseInt(command[2]), command[1]);
                    }
                    break;
                case "Remove":

                    schedule.remove(command[1]);

                    break;
                case "Swap":
                    String firsTitle = command[1];
                    String secondTitle = command[2];
                    swapping(schedule, firsTitle, secondTitle);

                    break;
                case "Exercise":
                    if (schedule.contains(command[1]) && !schedule.contains(command[1] + "-Exercise")) {

                        if (schedule.indexOf(command[1]) < schedule.size() - 1) {
                            schedule.add(schedule.indexOf(command[1]) + 1, command[1] + "-Exercise");
                        } else {
                            schedule.add(command[1] + "-Exercise");

                        }
                    } else {
                        if (!schedule.contains(command[1] + "-Exercise")) {
                            schedule.add(command[1]);
                            schedule.add(command[1] + "-Exercise");
                        }
                    }
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));

        }
    }

    public static void swapping(List<String> schedule, String firsTitle, String secondTitle) {
        if (schedule.contains(firsTitle) && schedule.contains(secondTitle)) {

            int firstIndex = schedule.indexOf(firsTitle);
            int secondIndex = schedule.indexOf(secondTitle);

            Collections.swap(schedule, firstIndex, secondIndex);

            if (schedule.contains(firsTitle + "-Exercise")) {
                if (secondIndex == schedule.size() - 1) {
                    schedule.add(firsTitle + "-Exercise");
                } else {
                    schedule.add(secondIndex + 1, firsTitle + "-Exercise");
                }
                schedule.remove(firstIndex + 1);

            } if (schedule.contains(secondTitle + "-Exercise")) {
                if (firstIndex == schedule.size() - 1) {
                    schedule.add(secondTitle + "-Exercise");
                } else {
                    schedule.add(firstIndex + 1, secondTitle + "-Exercise");
                }
                schedule.remove(secondIndex + 2);
            }
        }
    }
}