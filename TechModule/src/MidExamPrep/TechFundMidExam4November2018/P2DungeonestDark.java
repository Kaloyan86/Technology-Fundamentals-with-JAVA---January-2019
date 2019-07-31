package MidExamPrep.TechFundMidExam4November2018;

import java.util.Scanner;

public class P2DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");
        String[] commands = new String[2];

        int health = 100;
        int coins = 0;
        for (int i = 0; i < rooms.length; i++) {
            commands = rooms[i].split(" ");

            if (commands[0].equals("potion")) {

                if (health == 100) {
                    System.out.println("You healed for 0 hp.");
                } else {
                    health += Integer.parseInt(commands[1]);
                    if (health > 100) {
                        int healed = Integer.parseInt(commands[1]) - (health - 100);
                        health = 100;
                        System.out.println(String.format("You healed for %d hp.", healed));
                    }else {
                        System.out.println(String.format("You healed for %d hp.", Integer.parseInt(commands[1])));
                    }
                }
                System.out.println(String.format("Current health: %d hp.", health));
            } else if (commands[0].equals("chest")) {
                coins += Integer.parseInt(commands[1]);
                System.out.println(String.format("You found %d coins.", Integer.parseInt(commands[1])));
            } else {
                if (health - Integer.parseInt(commands[1]) > 0) {
                    health -= Integer.parseInt(commands[1]);
                    System.out.println(String.format("You slayed %s.", commands[0]));
                }else {
                    System.out.println(String.format("You died! Killed by %s.",commands[0]));
                    System.out.println(String.format("Best room: %d",i+1));
                    return;
                }
            }
        }
        System.out.println(String.format("You've made it!\nCoins: %d\nHealth: %d",coins,health));


    }
}
