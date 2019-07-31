package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Lab4WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(e -> e.length() % 2 == 0).toArray(String[]::new);
        Arrays.stream(words).forEach(System.out::println);


    }
}
