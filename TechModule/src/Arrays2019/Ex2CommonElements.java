package Arrays2019;

import java.util.Scanner;

public class Ex2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] arr1 = input1.split(" ");
        String[] arr2 = input2.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i].equals(arr1[j])) {
                    System.out.print(arr1[j] + " ");
                }

            }


        }
    }
}
