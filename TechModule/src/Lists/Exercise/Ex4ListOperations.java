package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] cmd = input.split("\\s+");

            if (cmd[0].equals("Add")) {
                numbers.add(Integer.parseInt(cmd[1]));

            } else if (cmd[0].equals("Insert")) {
                if (Integer.parseInt(cmd[2]) >= 0 && Integer.parseInt(cmd[2]) < numbers.size()) {
                    int element = Integer.parseInt(cmd[1]);
                    int index = Integer.parseInt(cmd[2]);
                    numbers.add(index, element);
                } else{
                    System.out.println("Invalid index");
                }

            } else if (cmd[0].equals("Remove")) {
                if (Integer.parseInt(cmd[1]) >= 0 && Integer.parseInt(cmd[1]) < numbers.size()) {
                    numbers.remove(Integer.parseInt(cmd[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (cmd[1].equals("left")) {
                int index = Integer.parseInt(cmd[2]);
                for (int i = 0; i < index; i++) {
                    numbers.add(numbers.size(), numbers.get(0));
                    numbers.remove(numbers.get(0));
                }


            } else if (cmd[1].equals("right")) {

                int index = Integer.parseInt(cmd[2]);
                for (int i = 0; i < index; i++) {
                    numbers.add(0, numbers.get(numbers.size() - 1));
                    numbers.remove(numbers.size() - 1);
                }


            }


            input = scanner.nextLine();
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
