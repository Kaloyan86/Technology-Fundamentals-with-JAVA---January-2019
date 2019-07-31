package AssociativeArrays.Exercises;

import java.util.*;

public class Ex7StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }
        Map<String, Double> newStudents = new LinkedHashMap<>();
        students.entrySet().stream().filter(map -> map.getValue().stream().mapToDouble(x -> x).average().getAsDouble() >= 4.50)
        .forEach(e->newStudents.put(e.getKey(),e.getValue().stream().mapToDouble(x -> x).average().getAsDouble()));
        System.out.println();
        newStudents.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).forEach(p -> System.out.println(String.format("%s -> %.2f",
                p.getKey(), (p.getValue()))));


    }
}
