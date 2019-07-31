package MidExamPrep.ProgFundAdditionalRetakExam10January2019Part1;


import java.util.*;
import java.util.stream.Collectors;

public class P2SantasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> houses = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int index = 0;
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("Forward")) {
                index += Integer.parseInt(command[1]);
                if (index >= 0 && index < houses.size()) {
                    houses.remove(index);
                }else {
                    index-=Integer.parseInt(command[1]);
                }
            } else if (command[0].equals("Back")) {
                index -= Integer.parseInt(command[1]);
                if (index >= 0 && index < houses.size()) {
                    houses.remove(index);
                }else {
                    index+=Integer.parseInt(command[1]);
                }

            } else if (command[0].equals("Gift")) {
                String houseNumb = command[2];
               int newIndex = Integer.parseInt(command[1]);
                if (newIndex >= 0 && newIndex < houses.size()) {
                    houses.add(newIndex, houseNumb);
                    index = newIndex;
                }
            } else if (command[0].equals("Swap")) {
                if (houses.contains(command[1]) && houses.contains(command[2])) {
                    Collections.swap(houses, houses.indexOf(command[1]), houses.indexOf(command[2]));

                }
            }

        }
        System.out.println("Position: " + index);
        System.out.println(houses.toString().replaceAll("[\\[\\]]", ""));
    }
}
