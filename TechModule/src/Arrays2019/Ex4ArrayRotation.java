package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int first = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = first;
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");

        }
    }
}
