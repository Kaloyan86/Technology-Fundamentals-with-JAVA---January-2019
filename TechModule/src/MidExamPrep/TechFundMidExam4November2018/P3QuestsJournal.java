package MidExamPrep.TechFundMidExam4November2018;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Retire!")) {

            String[] commands = input.split(" - ");
            switch (commands[0]) {
                case "Start":
                    if (!journal.contains(commands[1])) {
                        journal.add(commands[1]);
                    }
                    break;
                case "Complete":
                    if (journal.contains(commands[1])){
                        journal.remove(commands[1]);
                    }
                    break;
                case "Side Quest":
                    String[] cmd = commands[1].split(":");
                    if (journal.contains(cmd[0])&&!journal.contains(cmd[1])){
                        journal.add(journal.indexOf(cmd[0])+1,cmd[1]);

                    }
                    break;
                case "Renew":
                    if (journal.contains(commands[1])){
                        journal.remove(commands[1]);
                        journal.add(commands[1]);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",journal));
    }
}
