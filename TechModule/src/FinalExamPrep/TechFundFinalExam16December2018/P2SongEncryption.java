package FinalExamPrep.TechFundFinalExam16December2018;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexSong = "^(?:[\\s]*)([A-Z][a-z' ]*):(?:[\\s]*)([A-Z\\s]+)(?:[\\s]*)$";

        String encrypted = "";
        while (!input.equals("end")) {

            Pattern pattern = Pattern.compile(regexSong);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                int codeKey = matcher.group(1).length();
                for (int i = 0; i < input.length(); i++) {

                    char symbol = (char) (input.charAt(i) + codeKey);

                    if (input.charAt(i) > 64 && input.charAt(i) < 91) {
                        while (symbol > 90) {
                            int newCode = symbol - 90;
                            symbol = (char) (64 + newCode);
                        }
                        encrypted += symbol;
                    } else if (input.charAt(i) > 96 && input.charAt(i) < 123) {

                        while (symbol > 122) {
                            int newCode = symbol - 122;
                            symbol = (char) (96 + newCode);
                        }
                        encrypted += symbol;

                    } else if (input.charAt(i) == 32) {
                        encrypted += " ";
                    } else if (input.charAt(i) == 39) {
                        encrypted += "'";
                    } else if (input.charAt(i) == 58) {
                        encrypted += "@";
                    } else {
                        encrypted += symbol;
                    }

                }
                System.out.println("Successful encryption: " + encrypted);
            } else {
                System.out.println("Invalid input!");
            }
            encrypted = "";
            input = scanner.nextLine();
        }

    }
}
