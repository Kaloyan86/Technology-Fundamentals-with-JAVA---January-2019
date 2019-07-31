package Methods;

import java.util.Scanner;

public class Ex6MiddleCharacters {
    public static void MiddleChar(String input) {
        if (input.length() % 2 == 0) {
            for (int i = input.length() / 2; i <= (input.length() / 2) + 1; i++) {
                System.out.print(input.charAt(i - 1));
            }
        } else {
            for (int i = input.length() / 2; i < (input.length() / 2) + 1; i++) {
                System.out.print(input.charAt(i));
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        MiddleChar(input);
    }
}
