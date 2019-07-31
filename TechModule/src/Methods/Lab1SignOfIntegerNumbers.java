package Methods;

import java.util.Scanner;

public class Lab1SignOfIntegerNumbers {
    public static void printSign(int number) {
        if (number > 0)
            System.out.printf("The number %d is positive.", number);
        else if (number < 0)
            System.out.printf("The number %d is negative.", number);
        else
            System.out.printf("The number %d is zero.", number);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSign(Integer.parseInt(scanner.nextLine()));
    }
}
