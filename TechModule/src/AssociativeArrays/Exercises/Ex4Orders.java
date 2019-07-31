package AssociativeArrays.Exercises;

import java.util.*;

public class Ex4Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> products = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {
            String[] data = input.split(" ");
            String name = data[0];
            Double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);
            if (products.containsKey(name)) {
                products.get(name).set(0, price);
                products.get(name).set(1, products.get(name).get(1) + quantity);
            } else {
                products.put(name, new ArrayList<>());
                products.get(name).add(price);
                products.get(name).add(quantity);
            }


            input = scanner.nextLine();
        }
        products.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key,
                value.get(0) * value.get(1))));

    }
}
