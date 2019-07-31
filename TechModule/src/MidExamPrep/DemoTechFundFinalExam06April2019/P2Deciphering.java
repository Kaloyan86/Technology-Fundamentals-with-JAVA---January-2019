package MidExamPrep.DemoTechFundFinalExam06April2019;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2Deciphering {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] substrings = scanner.nextLine().split("\\s+");
        String regex = "^[d-z{}|#]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder decrypted = new StringBuilder();

        if (matcher.find()) {
            for (int j = 0; j < input.length(); j++) {
                char symbol = (char) (input.charAt(j) - 3);
                decrypted.append(symbol);
            }

            String first = substrings[0];
            String second = substrings[1];

            int indexOfFirst = decrypted.indexOf(first);
            while (indexOfFirst != -1 && !first.equals(second)) {

                decrypted = new StringBuilder(decrypted.substring(0, indexOfFirst)
                        + second + decrypted.substring(indexOfFirst + first.length()));
                indexOfFirst = decrypted.indexOf(first);
            }
            System.out.println(decrypted);
        } else {
            System.out.println("This is not the book you are looking for.");
        }

    }
}