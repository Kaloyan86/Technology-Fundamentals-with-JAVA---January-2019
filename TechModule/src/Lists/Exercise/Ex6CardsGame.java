package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (player1.size() != 0 && player2.size() != 0) {

            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            } else if (player1.get(0) < player2.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player1.remove(0);
                player2.remove(0);
            } else {
                player1.remove(0);
                player2.remove(0);
            }

        }
        if (player1.size() == 0) {
            int sum2 = 0;
            for (Integer numb : player2) {
                sum2 += numb;
            }
            System.out.printf("Second player wins! Sum: %d",sum2);
        } else {
            int sum1 = 0;
            for (Integer numb : player1) {
                sum1 += numb;
            }
            System.out.printf("First player wins! Sum: %d",sum1);

        }
    }
}
