package Arrays2019;

import java.util.Scanner;

public class arrayLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        String[] indexes = scanner.nextLine().split(" ");
        int[] field = new int[fieldSize];
        for (String indexe : indexes) {
            int index = Integer.parseInt(indexe);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);
            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = scanner.nextLine();
                continue;
            }
            field[index] = 0;
            if (cmd.equals("right")) {
                index += flyLength;
                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;

                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
                command = scanner.nextLine();
            } else {
                index -= flyLength;
                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }
        }
        for (int aField : field) {
            System.out.print(aField + " ");
        }
        System.out.println();
    }
}
