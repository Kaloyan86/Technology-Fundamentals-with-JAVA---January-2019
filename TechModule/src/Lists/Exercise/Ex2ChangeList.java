package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] cmd = input.split("\\s+");
            if (cmd[0].equals("Delete")) {
                int numb = Integer.parseInt(cmd[1]);
                numbers.removeIf(e -> e == numb);
            } else if (cmd[0].equals("Insert")) {
                int element = Integer.parseInt(cmd[1]);
                int index = Integer.parseInt(cmd[2]);
                if (index < numbers.size()) {
                    numbers.add(index, element);
                }
            }

            input = scanner.nextLine();
        }
        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
