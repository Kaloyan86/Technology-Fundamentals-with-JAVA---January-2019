package MidExamPrep.RetakeMidExam18December2018;

import java.util.Arrays;
import java.util.Scanner;

public class P3PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] field = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String input = "";
        int currentHouse = 0;

        while (!"Merry Xmas!".equals(input = scanner.nextLine())) {
            String[] data = input.split(" ");
            String command = data[0];
            int jumpLength = Integer.parseInt(data[1]);
            currentHouse += jumpLength;
            if (command.equals("Jump")) {
                while (currentHouse >= field.length) {
                    currentHouse -= field.length;
                }
                if (field[currentHouse] == 0) {
                    System.out.println(String.format("House %d will have a Merry Christmas.", currentHouse));
                    continue;
                }
                field[currentHouse] -= 2;
                if (field[currentHouse] < 0) {
                    field[currentHouse] = 0;
                }

            }
        }
        System.out.println(String.format("Santa's last position was %d.", currentHouse));
        int sum = Arrays.stream(field).sum();
        if (sum == 0) {
            System.out.println("Mission was successful.");
        } else {
            long numb =field.length - Arrays.stream(field).filter(e -> e == 0).count();
            System.out.println(String.format("Santa has failed %d houses.",numb));
        }
    }
}
