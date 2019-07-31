package Methods;

import java.util.Scanner;

public class Ex3CharactersInRange {
    public static void charactersInRange(char first, char second) {
        if (first > second) {
            for (int i = second+1; i < first; i++) {
                System.out.print((char) i + " ");
            }
        }
        for (int i = first + 1; i < second; i++) {
            System.out.print((char) i + " ");

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        charactersInRange(first, second);
    }
}
