package TextProcesingRegex.Exercise;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11SoftUniBarIncome {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%([A-Z][a-z]+)%(?:[^|$%.]*)<(\\w+)>(?:[^|$%.]*)\\|(\\d+)\\|(?:[^|$%.]*?)([-+]?\\d+\\.?\\d+)\\$";
        double totalIncome = 0;
        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                double price = Double.parseDouble(matcher.group(3)) * Double.parseDouble(matcher.group(4));
                System.out.println(String.format("%s: %s - %.2f", matcher.group(1), matcher.group(2), price));
                totalIncome += price;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalIncome);
    }
}
