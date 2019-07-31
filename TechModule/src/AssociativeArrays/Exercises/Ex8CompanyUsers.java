package AssociativeArrays.Exercises;

import java.util.*;

public class Ex8CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companies = new TreeMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String name = data[0];
            String id = data[1];
            companies.putIfAbsent(name, new ArrayList<>());
            if (!companies.get(name).contains(id)) {
                companies.get(name).add(id);
            }
            input = scanner.nextLine();
        }
        companies.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().stream().forEach(n -> System.out.println(String.format("-- %s", n)));
        });
    }
}