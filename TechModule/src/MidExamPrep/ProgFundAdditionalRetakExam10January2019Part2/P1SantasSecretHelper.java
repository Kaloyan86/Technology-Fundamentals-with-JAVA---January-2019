package MidExamPrep.ProgFundAdditionalRetakExam10January2019Part2;

import java.util.Scanner;

public class P1SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String newCode = "";

            for (int i = 0; i < input.length(); i++) {
                int asciiNumb = input.charAt(i) - n;
                newCode += (char) asciiNumb;
            }

            String[] arrayName = newCode.split("@");
            String name = "";
            for (int i = 0; i < arrayName[1].length(); i++) {
                int asciiNumb = arrayName[1].charAt(i);
                if ((asciiNumb >= 65 && asciiNumb <= 90) || (asciiNumb >= 97 && asciiNumb <= 122)) {
                    name += (char) asciiNumb;
                } else {
                    break;
                }

            }
            String[] type = arrayName[1].split("!");
            if (type[0].contains("@") || type[0].contains("-")
                    || type[0].contains("!") || type[0].contains(":") || type[0].contains(">")) {
                input = scanner.nextLine();
                continue;
            }
            if (type[1].equals("G")) {
                System.out.println(name);
            }
            input = scanner.nextLine();
        }
    }
}
