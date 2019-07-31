package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] cmd = input.split(" ");
            if (cmd[0].equals("Add")) {
                int newWagon = Integer.parseInt(cmd[1]);
                wagons.add(newWagon);
            } else {
                int addPeople = Integer.parseInt(cmd[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + addPeople <= maxPeople) {
                        wagons.set(i, wagons.get(i) + addPeople);
                        break;
                    }

                }
            }

            input = scanner.nextLine();
        }

        System.out.print(wagons.toString().replaceAll("[\\[\\],]", ""));


    }
}
