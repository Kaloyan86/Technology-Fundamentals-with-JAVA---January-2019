package FinalExamPrep.TechnFundRetakeFinalExam20Dec2018;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split(", ");

        Map<String, String> gamesDLC = new LinkedHashMap<>();
        Map<String, Double> gamesPrice = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            if (!input[i].contains(":")) {
                String gameName = input[i].substring(0, input[i].lastIndexOf('-'));
                double price = Double.parseDouble(input[i].substring(input[i].lastIndexOf('-') + 1));
                gamesPrice.putIfAbsent(gameName, price);
            } else {
                String gameName = input[i].substring(0, input[i].lastIndexOf(':'));
                String dlc = input[i].substring(input[i].lastIndexOf(':') + 1);

                if (gamesPrice.containsKey(gameName)) {
                    gamesDLC.putIfAbsent(gameName, dlc);
                    gamesPrice.replace(gameName, gamesPrice.get(gameName), gamesPrice.get(gameName) * 1.2);
                }

            }
        }

        for (String name : gamesPrice.keySet()) {
            if (gamesDLC.containsKey(name)) {
                gamesPrice.replace(name, gamesPrice.get(name), gamesPrice.get(name) * 0.5);
            } else {
                gamesPrice.replace(name, gamesPrice.get(name), gamesPrice.get(name) * 0.8);
            }
        }
        gamesPrice.entrySet().stream().sorted((e1, e2) -> Double.compare(e1.getValue(), e2.getValue()))
                .forEach(e -> {
                    if (gamesDLC.containsKey(e.getKey())) {
                        String dlc = gamesDLC.get(e.getKey());
                        System.out.println(String.format("%s - %s - %.2f", e.getKey(), dlc, e.getValue()));
                    }
                });

        gamesPrice.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> {
                    if (!gamesDLC.containsKey(e.getKey())) {
                        System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue()));
                    }
                });
    }
}
