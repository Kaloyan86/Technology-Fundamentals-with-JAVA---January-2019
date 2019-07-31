package Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Lab3MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int size = Math.min(first.size(), second.size());


        for (int i = 0; i < size; i++) {
            result.add(first.get(i));
            result.add(second.get(i));


        }
        if (first.size() > second.size()) {
            result.addAll(getRemainingElements(first, second));
        } else if (second.size() > first.size()) {
            result.addAll(getRemainingElements(second,first));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }

    private static Collection<? extends Integer> getRemainingElements(List<Integer> first, List<Integer> second) {
        List<Integer> remElm = new ArrayList<>();
        int smallestSize = Math.min(first.size(), second.size());
        int biggerSize = Math.max(first.size(), second.size());

        for (int i = smallestSize; i < biggerSize; i++) {
            remElm.add(first.get(i));

        }
        return remElm;
    }

}
