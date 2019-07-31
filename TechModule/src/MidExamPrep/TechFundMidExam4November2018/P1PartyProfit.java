package MidExamPrep.TechFundMidExam4November2018;

import java.util.Scanner;

public class P1PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int partySize = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int coins = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 10 == 0) {
                partySize -= 2;
            }
            if (i % 15 == 0) {
                partySize += 5;
            }
            coins += 50;
            coins -= partySize * 2;
            if (i % 3 == 0) {
                coins -= 3 * partySize;
            }
            if (i % 5 == 0) {
                coins += 20 * partySize;
                if (i % 3 == 0) {
                    coins -= 2 * partySize;
                }
            }

        }
        System.out.println(String.format("%d companions received %.0f coins each.",partySize,Math.floor((double) coins/partySize)));
    }
}
