package MidExamPrep.DemoTechFundFinalExam06April2019;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class P1Dictionary {
    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitedByPipe = input.split("\\s+\\|\\s+");

        Map<String, List<String>> result = new LinkedHashMap<>();

        for (int i = 0; i < splitedByPipe.length; i++) {
            String[] word = splitedByPipe[i].split(":\\s+");
            result.putIfAbsent(word[0], new ArrayList<>());
            result.get(word[0]).add(word[1]);

        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("List")) {
                result.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(e ->
                        System.out.print(e.getKey() + " "));
                break;
            }
            List<String> keyWords = Arrays.stream(input.split("\\s+\\|\\s+")).sorted((e1,e2)->e1.compareTo(e2)).collect(Collectors.toList());
            for (int i = 0; i < keyWords.size(); i++) {
                if (result.containsKey(keyWords.get(i))) {
                    String wordName = keyWords.get(i);
                    result.entrySet().stream().filter(e -> e.getKey().equals(wordName))
                            .forEach(e -> {
                                System.out.println(wordName);
                                e.getValue().stream().sorted((e1, e2) -> Integer.compare(e2.length(), e1.length()))
                                        .forEach(p -> System.out.println(String.format(" -%s", p)));
                            });
                }else {
                    break;
                }
            }

            input = scanner.nextLine();
        }

    }
}
