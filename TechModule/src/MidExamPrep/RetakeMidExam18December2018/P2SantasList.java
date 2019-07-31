package MidExamPrep.RetakeMidExam18December2018;

        import java.util.Arrays;
        import java.util.List;
        import java.util.Scanner;
        import java.util.stream.Collectors;

public class P2SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> kids = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Finished!")) {
            String[] cmd = input.split(" ");
            if (cmd[0].equals("Bad")) {
                if (kids.contains(cmd[1])) {
                    input = scanner.nextLine();
                    continue;
                } else {
                    kids.add(0, cmd[1]);
                }
            } else if (cmd[0].equals("Good")) {
                if (kids.contains(cmd[1])) {
                    kids.remove(cmd[1]);
                }
            } else if (cmd[0].equals("Rename")) {
                if (kids.contains(cmd[1])) {
                    kids.add(kids.indexOf(cmd[1]), cmd[2]);
                    kids.remove(cmd[1]);
                }
            } else if (cmd[0].equals("Rearrange")) {
                if (kids.contains(cmd[1])) {
                    kids.remove(cmd[1]);
                    kids.add(kids.size(), cmd[1]);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ",kids));
    }
}
