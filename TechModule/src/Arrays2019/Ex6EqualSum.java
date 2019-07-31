package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < input.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int j = i + 1; j < input.length; j++) {
                rightSum += input[j];

            }
            for (int j = i; j > 0; j--) {
                leftSum += input[j - 1];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            } else {

                leftSum = 0;
                rightSum = 0;
            }
        }
        System.out.println("no");

    }
}
