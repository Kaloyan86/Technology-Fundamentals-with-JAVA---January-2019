package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[2].equals("going!")) {
                if (!guests.contains(input[0])) {
                    guests.add(input[0]);
                } else {
                    System.out.println(input[0] + " is already in the list!");
                }

            } else if (input[2].equals("not")) {
                if (guests.contains(input[0])) {
                    guests.remove(input[0]);
                } else {
                    System.out.println(input[0] + " is not in the list!");
                }
            }
        }
        for (String name : guests)
            System.out.println(name+" ");
        {

        }
    }
}
