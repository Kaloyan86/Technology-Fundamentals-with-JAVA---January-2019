package MidExam10March2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double clothes = 50;
        double shoes = 35;
        double accessories = 20.50;

        List<Double> boughtItems = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\|");
        double budget = Double.parseDouble(scanner.nextLine());
        double neededMoney = budget;
        double spentMoney = 0;

        for (int i = 0; i < input.length; i++) {
            String[] command = input[i].split("->");

            if (command[0].equals("Clothes")) {
                if (Double.parseDouble(command[1]) <= clothes) {
                    if (budget >= Double.parseDouble(command[1])) {
                        budget -= Double.parseDouble(command[1]);
                        spentMoney += Double.parseDouble(command[1]);
                        double newPrice = Double.parseDouble(command[1]) * 1.4;
                        boughtItems.add(newPrice);
                    }
                }
            } else if (command[0].equals("Shoes")) {
                if (Double.parseDouble(command[1]) <= shoes) {
                    if (budget >= Double.parseDouble(command[1])) {
                        budget -= Double.parseDouble(command[1]);
                        spentMoney += Double.parseDouble(command[1]);
                        double newPrice = Double.parseDouble(command[1]) * 1.4;
                        boughtItems.add(newPrice);
                    }

                }
            } else if (command[0].equals("Accessories")) {
                if (Double.parseDouble(command[1]) <= accessories) {
                    if (budget >= Double.parseDouble(command[1])) {
                        budget -= Double.parseDouble(command[1]);
                        spentMoney += Double.parseDouble(command[1]);
                        double newPrice = Double.parseDouble(command[1]) * 1.4;
                        boughtItems.add(newPrice);
                    }
                }

            }
        }


        double profit = 0;
        for (
                int i = 0; i < boughtItems.size(); i++) {
            System.out.printf("%.2f ", boughtItems.get(i));
            profit += boughtItems.get(i);
        }

        double totalProfit = profit - spentMoney;
        System.out.printf("\nProfit: %.2f\n", totalProfit);
        if (neededMoney + totalProfit >= 150) {
            System.out.println("Hello, France!");
        } else {
            System.out.println("Time to go.");
        }
    }
}
