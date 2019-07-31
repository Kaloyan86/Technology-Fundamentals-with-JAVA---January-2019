package FinalExamPrep.TechFundFinalExam16December2018;

import java.util.*;
import java.util.stream.Collectors;

public class P1Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<String, List<String>> groupsAndMembers = new LinkedHashMap<>();
        Map<String, Integer> timeGroup = new LinkedHashMap<>();
        while (!input.equals("start of concert")) {

            String[] line = input.split("\\s*;\\s*");
            String command = line[0];
            String bandName = line[1];
            if (command.equals("Add")) {

                String[] singers = line[2].split("\\s*,\\s*");

                groupsAndMembers.putIfAbsent(bandName, new ArrayList<>());

                for (String singer : singers) {
                    if (!groupsAndMembers.get(bandName).contains(singer)) {
                        groupsAndMembers.get(bandName).add(singer);
                    }

                }

            } else if (command.equals("Play")) {

                timeGroup.putIfAbsent(bandName, 0);
                timeGroup.put(bandName, Integer.parseInt(line[2]) + timeGroup.get(bandName));


            }


            input = scanner.nextLine();
        }
        int totalTime = 0;
        for (Integer time : timeGroup.values()) {
            totalTime += time;
        }
        System.out.println("Total time: " + totalTime);
        timeGroup.entrySet().stream().sorted((e1, e2) -> {
            int sort = Integer.compare(e2.getValue(), e1.getValue());
            if (sort == 0) {
                sort = e1.getKey().compareTo(e2.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.println(String.format("%s -> %d", e.getKey(), e.getValue()));
        });
        String groupName = scanner.nextLine();
        groupsAndMembers.forEach((key, value) -> {
            if (key.equals(groupName)) {
                System.out.println(key);
                value.forEach(e -> System.out.println(String.format("=> %s", e)));
            }

        });
    }
}
