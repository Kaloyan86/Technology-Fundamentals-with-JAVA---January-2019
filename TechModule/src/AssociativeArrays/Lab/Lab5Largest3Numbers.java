package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab5Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        sorted.stream().limit(3).forEach(e -> System.out.print(e + " "));

    }
}
