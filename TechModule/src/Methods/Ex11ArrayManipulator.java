package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] cmdArgs = command.split(" ");

            if (cmdArgs[0].equals("exchange")) {
                int index = Integer.parseInt(cmdArgs[1]);
                if (index >= 0 && index < numbers.length) {
                    exchange(numbers, index);
                } else {
                    System.out.println("Invalid index");
                }
            }else if (cmdArgs[0].equals(""))
            command = scanner.nextLine();
        }
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            }else {
                System.out.print(numbers[i]);
            }
        }
        System.out.print("]");
    }


    public static void exchange(int[] numbers, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[numbers.length - (index + 1)];
        for (int i = 0; i <= index; i++) {
            first[i] = numbers[i];
        }
        for (int i = index + 1; i < numbers.length; i++) {
            second[i - (index + 1)] = numbers[i];
        }
        for (int i = 0; i < second.length; i++) {
            numbers[i] = second[i];
        }
        for (int i = second.length; i < numbers.length; i++) {
            numbers[i] = first[i - second.length];
        }
    }
}
