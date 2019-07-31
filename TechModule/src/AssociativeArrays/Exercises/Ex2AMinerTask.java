package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();


        Map<String, Long> mine = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            long quantity = Integer.parseInt(scanner.nextLine());
            mine.putIfAbsent(resource, (long) 0);
            mine.put(resource, mine.get(resource) + quantity);
            resource = scanner.nextLine();

        }
        for (Map.Entry<String, Long> pair : mine.entrySet()) {
            System.out.println(String.format("%s -> %d", pair.getKey(), pair.getValue()));

        }
    }
}
