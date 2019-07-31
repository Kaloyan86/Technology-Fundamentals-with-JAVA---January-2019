package Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commands[1]))) {
                        System.out.print("Yes");
                    } else {
                        System.out.print("No such number");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        numbers.stream().filter(n -> n % 2 == 0).forEach(e -> System.out.print(e + " "));
                    } else if (commands[1].equals("odd")) {
                        numbers.stream().filter(n -> n % 2 != 0).forEach(e -> System.out.print(e + " "));
                    }

                    break;

                case "Get":
                    numbers.stream().reduce((e1, e2) -> e1 + e2).ifPresent(System.out::print);
                    break;
                case "Filter":

                    filter(commands, numbers);
                    break;
            }
            System.out.println();
            input = scanner.nextLine();
        }
        // System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }

    static void filter(String[] commands, List<Integer> numbers) {
        if (commands[1].equals("<")) {
            numbers.stream().filter(e -> e < Integer.parseInt(commands[2])).forEach(e -> System.out.print(e + " "));

        } else if (commands[1].equals(">")) {
            numbers.stream().filter(e -> e > Integer.parseInt(commands[2])).forEach(e -> System.out.print(e + " "));


        } else if (commands[1].equals(">=")) {
            numbers.stream().filter(e -> e >= Integer.parseInt(commands[2])).forEach(e -> System.out.print(e + " "));

        } else if (commands[1].equals("<=")) {
            numbers.stream().filter(e -> e <= Integer.parseInt(commands[2])).forEach(e -> System.out.print(e + " "));

        }
    }
}
