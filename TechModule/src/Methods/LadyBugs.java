package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        String input = scanner.nextLine();
        int[] indexes = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt).filter(e -> e >= 0 && e < field.length).toArray();
        for (int i = 0; i < indexes.length; i++) {
            field[indexes[i]] = 1;
        }
        input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" ");
            int ladybugIndex = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);
            if (ladybugIndex >= 0 && ladybugIndex < field.length && field[ladybugIndex] == 1) {
                field[ladybugIndex] = 0;
                while (true) {
                    switch (direction) {
                        case "left":
                            ladybugIndex -= flyLength;
                            break;
                        case "right":
                            ladybugIndex += flyLength;
                            break;
                    }
                    if (ladybugIndex < 0 || ladybugIndex >= field.length) {
                        break;
                    }
                    if (field[ladybugIndex] == 0) {
                        field[ladybugIndex] = 1;
                        break;
                    }
                    if (field[ladybugIndex] == 1) {
                        continue;
                    }

                }
            }
            input = scanner.nextLine();

        }
        System.out.println(Arrays.stream(field).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

    }
}
