package MidExamPrep.DemoTechnologyFundamentalsMidExam02March2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> bestBread = new ArrayList<>();
        int bestSum = Integer.MIN_VALUE;
        String input = scanner.nextLine();
        while (!input.equals("Bake It!")) {
            List<Integer> current = Arrays.stream(input.split("\\#+"))
                    .map(Integer::parseInt).collect(Collectors.toList());
            if (current.size() > 10) {
                break;
            }
            int currSum = current.stream().mapToInt(e -> e).sum();
            double averageCurrent = (double) currSum / current.size();
            double averageBest = (double) bestSum / bestBread.size();
            if (currSum > bestSum) {
                bestBread = current;
                bestSum = currSum;
            } else if (currSum == bestSum) {
                if (averageCurrent > averageBest) {
                    bestBread = current;
                    bestSum = currSum;
                } else if (averageCurrent == averageBest) {
                    if (current.size() < bestBread.size()) {
                        bestBread = current;
                        bestSum = currSum;
                    }
                }
            }
            input = scanner.nextLine();
        }

        System.out.println(String.format("Best Batch quality: %d", bestSum));
        bestBread.forEach(e -> System.out.print(e + " "));
    }
}
