package AssociativeArrays.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Lab3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<String, Integer> oddOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i].toLowerCase();
            oddOccurrences.putIfAbsent(word, 0);
            oddOccurrences.put(word, oddOccurrences.get(word) + 1);
        }
        List<String> words = new ArrayList<>();
        for (Map.Entry<String, Integer> word : oddOccurrences.entrySet()) {
            if (word.getValue() % 2 != 0) {
                words.add(word.getKey());
            }
        }
        System.out.println(words.stream().collect(Collectors.joining(", ")));
    }
}
