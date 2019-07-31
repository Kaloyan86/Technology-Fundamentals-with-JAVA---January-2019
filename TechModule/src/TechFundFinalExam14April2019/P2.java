package TechFundFinalExam14April2019;

import java.util.*;
import java.util.stream.Collectors;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> store = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] data = input.split("->");
            String command = data[0];
            String storeName = data[1];


            if (command.equals("Add")) {
                String items = data[2];
                store.putIfAbsent(storeName, new ArrayList<>());

                String[] item = items.split(",");

                for (int i = 0; i < item.length; i++) {

                    store.get(storeName).add(item[i]);
                }

            } else if (command.equals("Remove")) {
                store.remove(storeName);
            }


            input = scanner.nextLine();
        }
        System.out.println("Stores list:");
        store.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;
                }).forEach(e -> {
            System.out.println(String.format("%s", e.getKey()));
            e.getValue().stream().forEach(p -> {
                System.out.println(String.format("<<%s>>", p));
            });
        });

    }
}
