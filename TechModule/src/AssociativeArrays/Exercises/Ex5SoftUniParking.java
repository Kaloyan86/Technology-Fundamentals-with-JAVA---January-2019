package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex5SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parking = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            if (data[0].equals("register")) {
                if (parking.containsKey(data[1])) {
                    System.out.println(String.format("ERROR: already registered with plate number %s", data[2]));
                } else {
                    parking.put(data[1], data[2]);
                    System.out.println(String.format("%s registered %s successfully", data[1], data[2]));
                }

            } else if (data[0].equals("unregister")) {
                if (parking.containsKey(data[1])) {
                    parking.remove(data[1]);
                    System.out.println(String.format("%s unregistered successfully",data[1]));

                }else {
                    System.out.println(String.format("ERROR: user %s not found",data[1]));
                }
            }
        }
        parking.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}

