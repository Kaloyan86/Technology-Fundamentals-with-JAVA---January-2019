package Arrays2019;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] condArr = new int[arr1.length - 1];

        if (arr1.length == 1) {
            System.out.println(arr1[0]);
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < condArr.length - i; j++) {


                condArr[j] = arr1[j] + arr1[j + 1];
            }

            arr1 = condArr;
        }
        System.out.println(condArr[0]);
    }
}

