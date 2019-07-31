package Methods;

import java.util.Scanner;

public class Ex9PalindromeIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input), reversedInteger = 0, remainder, originalInteger;


        // reversed integer is stored in variable
        while (!input.equals("END")) {
            num = Integer.parseInt(input);
            originalInteger = num;
            while (num != 0) {
                remainder = num % 10;
                reversedInteger = reversedInteger * 10 + remainder;
                num /= 10;

            }

            // palindrome if orignalInteger and reversedInteger are equal
            if
            (originalInteger == reversedInteger) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            reversedInteger = 0;
            input = scanner.nextLine();

        }
    }
}
