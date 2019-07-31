package AssociativeArrays.Exercises;

import java.util.*;

public class Ex10SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> examResults = new LinkedHashMap<>();
        Map<String, List<Integer>> submissions = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            if (!data[1].equals("banned")) {
                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                examResults.putIfAbsent(name, points);

                if (examResults.get(name) < points) {
                    examResults.put(name, points);
                }


                submissions.putIfAbsent(language, new ArrayList<>());
                submissions.get(language).add(points);
            } else {
                examResults.remove(data[0]);

            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        examResults.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%s | %d\n", e.getKey(), e.getValue());
        });
        System.out.println("Submissions:");
        submissions.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%s - %d\n", e.getKey(), e.getValue().size());
        });


    }
}
