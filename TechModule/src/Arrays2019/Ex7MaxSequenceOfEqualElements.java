package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 0;
        int maxLength = 0;
        int start = 0;

        for (int i = input.length - 1; i > 0; i--) {

            if (input[i] == input[i - 1]) {
                length++;
                if (maxLength <= length) {
                    maxLength = length;
                    start = i-1;

                }
            } else {
                length = 0;
            }

        }
        for (int i = start; i <= maxLength+start; i++) {
            System.out.print(input[i] + " ");
        }
    }
}

