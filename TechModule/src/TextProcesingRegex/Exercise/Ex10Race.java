package TextProcesingRegex.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex10Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> persons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> runners = new LinkedHashMap<>();
        String input = scanner.nextLine();
        String regexD = "(?<distance>[0-9])";
        String regexN = "(?<name>[A-Za-z]+)";
        while (!input.equals("end of race")) {
            Pattern pattern = Pattern.compile(regexD);
            Pattern pattern1 = Pattern.compile(regexN);
            Matcher matcher = pattern.matcher(input);
            Matcher matcher1 = pattern1.matcher(input);
            int distance = 0;
            String name = "";
            while (matcher.find()) {
                distance += Integer.parseInt(matcher.group("distance"));
            }
            while (matcher1.find()) {
                name += matcher1.group();
            }
            if (persons.contains(name)) {
                runners.putIfAbsent(name, 0);
                runners.put(name, runners.get(name) + distance);
            }

            input = scanner.nextLine();
        }
        int place = 1;

        for (Map.Entry<String, Integer> stringIntegerEntry : runners.entrySet().stream().sorted((e1, e2) ->
                Integer.compare(e2.getValue(), e1.getValue())).limit(3).collect(Collectors.toList())) {
            if (place == 1) {
                System.out.println(String.format("%dst place: %s", place, stringIntegerEntry.getKey()));
            }else if (place==2){
                System.out.println(String.format("%dnd place: %s", place, stringIntegerEntry.getKey()));
            }else {
                System.out.println(String.format("%drd place: %s", place, stringIntegerEntry.getKey()));
            }

            place++;
        }
    }
}
