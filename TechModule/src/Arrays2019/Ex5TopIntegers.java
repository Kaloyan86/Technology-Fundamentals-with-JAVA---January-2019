package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input.length; i++) {
            boolean bigger = true;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] <= input[j]) {
                    bigger = false;
                }
            }
            if (bigger) {
                System.out.print(input[i] + " ");
            }
        }
    }
}
