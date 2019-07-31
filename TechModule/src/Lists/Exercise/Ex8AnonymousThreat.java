package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" +")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] cmd = command.split(" +");
            int startIndex = Math.min(Integer.parseInt(cmd[1]), elements.size() - 1);
            startIndex = Math.max(0, startIndex);
           int endIndex = Integer.parseInt(cmd[2]);

            List<String> result = new ArrayList<>();
            if (cmd[0].equals("merge")) {
                endIndex = Math.min(Integer.parseInt(cmd[2]), elements.size() - 1);
                endIndex = Math.max(0, endIndex);

                if (startIndex > 0) {
                    result.addAll(elements.subList(0, startIndex));
                }
                String merged = elements.subList(startIndex, endIndex + 1).stream()
                        .reduce((res, el) -> res + el).get();
                result.add(merged);
                if (endIndex + 1 < elements.size()) {
                    result.addAll(elements.subList(endIndex + 1, elements.size()));
                }
                elements = result;

            } else if (cmd[0].equals("divide")) {
                String element = elements.get(startIndex);
                int symbols = element.length() / endIndex;
                int parts = endIndex;
                if (element.length() % endIndex  != 0) {
                    for (int i = 0; i < parts - 1; i++) {
                        result.add(element.substring(0, symbols));
                        element = element.substring(symbols);
                    }
                } else {
                    for (int i = 0; i < parts; i++) {
                        result.add(element.substring(0, symbols));
                        element = element.substring(symbols);
                    }
                }
                if (!element.isEmpty()) {
                    result.add(element);
                }
                elements.remove(startIndex);
                elements.addAll(startIndex, result);

            }
            command = scanner.nextLine();
        }
        elements.forEach(e -> System.out.print(e + " "));
    }
}
