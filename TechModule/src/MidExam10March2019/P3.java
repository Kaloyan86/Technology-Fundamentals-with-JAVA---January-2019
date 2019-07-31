package MidExam10March2019;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split(" ");
            if (command[0].equals("Change")) {
                if (numbers.contains(command[1])) {
                    int index = numbers.indexOf(numbers.stream().filter(e -> e.equals(command[1])).findFirst().get());
                    numbers.remove(numbers.stream().filter(e -> e.equals(command[1])).findFirst().get());
                    numbers.add(index, command[2]);
                }

            } else if (command[0].equals("Hide")) {
                numbers.remove(command[1]);
            } else if (command[0].equals("Switch")) {
                if (numbers.contains(command[1]) && numbers.contains(command[2])) {
                    Collections.swap(numbers, numbers.indexOf(command[1]), numbers.indexOf(command[2]));
                }

            } else if (command[0].equals("Insert")) {
                if (Integer.parseInt(command[1]) + 1 < numbers.size()) {
                    numbers.add(Integer.parseInt(command[1]) + 1, command[2]);
                }
            } else if (command[0].equals("Reverse")) {
                Collections.reverse(numbers);
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
    }
}
