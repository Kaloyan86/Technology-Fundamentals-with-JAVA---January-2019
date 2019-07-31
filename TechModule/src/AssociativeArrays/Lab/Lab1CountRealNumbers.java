package AssociativeArrays.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class Lab1CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countByNumbers = new TreeMap<>();

        for (double number : numbers) {
            if (!countByNumbers.containsKey(number)) {
                countByNumbers.put(number, 0);
            }
            countByNumbers.put(number, countByNumbers.get(number) + 1);
        }
        DecimalFormat df = new DecimalFormat("#.#######");
        for (Map.Entry<Double, Integer> pair : countByNumbers.entrySet()) {
            double number = pair.getKey();
            String formattedNumber = df.format(number);
            int count = pair.getValue();

            System.out.println(String.format("%s -> %d", formattedNumber, count));
        }
    }
}
