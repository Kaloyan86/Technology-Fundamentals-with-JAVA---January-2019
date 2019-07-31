package MidExamPrep.DemoTechnologyFundamentalsMidExam02March2019;

import java.util.Scanner;

public class P2BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] events = scanner.nextLine().split("\\|");
        String[] commands = new String[2];
        int coins = 100;
        int energy = 100;
        boolean managed = true;
        for (int i = 0; i < events.length; i++) {

            commands = events[i].split("-");
            if (commands[0].equals("rest")) {

                if (energy == 100) {
                    System.out.println("You gained 0 energy.");
                } else {
                    energy += Integer.parseInt(commands[1]);
                    if (energy > 100) {
                        int restEnergy = energy - 100;
                        energy = 100;
                        System.out.printf("You gained %d energy.\n", Integer.parseInt(commands[1]) - restEnergy);

                    } else {
                        System.out.printf("You gained %d energy.\n", Integer.parseInt(commands[1]));
                    }
                }
                System.out.printf("Current energy: %d.\n", energy);
            } else if (commands[0].equals("order")) {
                if (energy >= 30) {
                    energy -= 30;
                    coins += Integer.parseInt(commands[1]);
                    System.out.println(String.format("You earned %d coins.", Integer.parseInt(commands[1])));
                } else {
                    energy += 50;
                    System.out.println("You had to rest!");
                }

            } else {
                if (coins > Integer.parseInt(commands[1])) {
                    coins -= Integer.parseInt(commands[1]);
                    System.out.println(String.format("You bought %s.", commands[0]));
                } else {
                    System.out.println(String.format("Closed! Cannot afford %s.", commands[0]));
                    return;
                }

            }


        }
            System.out.println(String.format("Day completed!\n" +
                    "Coins: %d\n" +
                    "Energy: %d\n", coins, energy));


    }

}
