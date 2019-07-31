package Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex5BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int[] bombs = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        while (numbers.contains(bombs[0])) {
            int indexOfBomb = numbers.indexOf(bombs[0]);
            int powerOfBomb = bombs[1];
            int startIndex = indexOfBomb - powerOfBomb;
            startIndex = Math.max(0, startIndex);
            int endIndex = Math.min(indexOfBomb + powerOfBomb, numbers.size() - 1);

            for (int i = startIndex; i <= endIndex; i++) {
                numbers.remove(startIndex);

            }
        }
        int sum = 0;
        for (Integer numb : numbers) {
            sum += numb;
        }
        System.out.println(sum);
    }
}
