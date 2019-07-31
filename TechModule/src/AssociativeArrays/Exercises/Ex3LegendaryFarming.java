package AssociativeArrays.Exercises;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.putIfAbsent("shards", 0);
        materials.putIfAbsent("fragments", 0);
        materials.putIfAbsent("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();

        String winner = "";
        boolean flag = false;
        do {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                String key = input[i + 1].toLowerCase();
                int value = Integer.parseInt(input[i]);
                if (materials.containsKey(key)) {
                    materials.put(key, materials.get(key) + value);
                    if (materials.get(key) >= 250) {
                        materials.put(key, materials.get(key) - 250);
                        winner = key;
                        flag = true;
                        break;
                    }
                } else {
                    junks.putIfAbsent(key, 0);
                    junks.put(key, junks.get(key) + value);
                }



            }


        } while (!flag);
        if (winner.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
        } else if (winner.equals("fragments")) {
            System.out.println("Valanyr obtained!");
        } else if (winner.equals("motes")) {
            System.out.println("Dragonwrath obtained!");

        }
        materials
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue(), e1.getValue());
                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(e -> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });

        junks.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> {
                    System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
                });
    }

}
