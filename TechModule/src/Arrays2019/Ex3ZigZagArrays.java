package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String line1 = "";
        String line2 = "";
        for (int i = 1; i <= n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                line1 += " " + input[0];
                line2 += " " + input[1];
            } else {
                line1 += " " + input[1];
                line2 += " " + input[0];
            }

        }
        System.out.println(line2);
        System.out.println(line1);

    }
}