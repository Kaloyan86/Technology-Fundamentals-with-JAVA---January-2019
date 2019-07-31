package MidExamPrep.ProgFundAdditionalRetakExam10January2019Part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2SantasNewList {
    public static class child {
        String name;
        int presents;

        public child(String name, int presents) {
            this.name = name;
            this.presents = presents;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPresents() {
            return presents;
        }

        public void setPresents(int presents) {
            this.presents = presents;
        }

        @Override
        public String toString() {
            return String.format("%s -> %d", name, presents);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<child> kids = new ArrayList<>();
        int toys = 0;
        int candies = 0;
        int clothes = 0;
        while (!input.equals("END")) {
            String[] data = input.split("->");
            if (data[1].equals("Toys")) {
                toys += Integer.parseInt(data[2]);
            } else if (data[1].equals("Candy")) {
                candies += Integer.parseInt(data[2]);
            } else if (data[1].equals("Clothes")) {
                clothes += Integer.parseInt(data[2]);
            }
            if (data[0].equals("Remove")) {
                if (kids.contains(data[1])) {
                    kids.remove(data[1]);
                }
            }
            child child = new child(data[0], Integer.parseInt(data[2]));
//            if (kids.stream().filter(name -> name.getName().equals(data[0])).findFirst().isPresent()) {
//                int currentPresents = kids.stream()
//                        .filter(name -> name.getName().equals(data[0])).forEach(child.getPresents()->child.setPresents());
//                kids.stream().filter(name -> name.getName().equals(data[0])).forEach(e -> e.setPresents());
//            } else {
//                kids.add(child);
//            }

            input = scanner.nextLine();
        }
        kids.stream().forEach(System.out::println);

    }
}
