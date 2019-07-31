package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeField = Integer.parseInt(scanner.nextLine());
        int[] indexesToPlantBugs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String[] commandInput = scanner.nextLine().split(" ");

        int[] field = new int[sizeField];
        for (int i = 0; i < indexesToPlantBugs.length; i++) {
            if (indexesToPlantBugs[i] >= 0 && indexesToPlantBugs[i] < sizeField) {
                field[indexesToPlantBugs[i]] = 1;
            }
        }
        while (!commandInput[0].equals("end")) {
            int bugIndex = Integer.parseInt(commandInput[0]);
            String flightDirection = commandInput[1];
            int flightLength = Integer.parseInt(commandInput[2]);

            String correctedDirection = flightDirection;
            if (flightLength < 0) {
                switch (flightDirection) {
                    case "left":
                        correctedDirection = "right";
                        break;
                    case "right":
                        correctedDirection = "left";
                        break;
                }
            }
            if (bugIndex >= 0 && bugIndex < sizeField) {
                if (field[bugIndex] == 1) {
                    field[bugIndex] = 0;
                    if (correctedDirection.equals("left")) {

                        flightLength = Math.abs(flightLength);
                        for (int i = bugIndex - flightLength; i >= 0; i = i - flightLength) {
                            if (field[i] == 0) {
                                field[i] = 1;
                                break;
                            }
                        }
                    }
                    if (correctedDirection.equals("right")) {

                        flightLength = Math.abs(flightLength);
                        for (int i = bugIndex + flightLength; i < field.length; i = i + flightLength) {
                            if (field[i] == 0) {
                                field[i] = 1;
                                break;
                            }
                        }
                    }
                }
            }
            commandInput = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");

        }


    }
}