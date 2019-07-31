package TextProcesingRegex.Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9Furniture {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String regex = "^>+(?<furniture>[A-Z]+[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)+!(?<quantity>\\d+)+\\b";
        String input = scanner.nextLine();

        double spendMoney = 0;
        System.out.println("Bought furniture:");
        while (!input.equals("Purchase")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group(1));
                spendMoney+=Double.parseDouble(matcher.group(2))*
                        Integer.parseInt(matcher.group(3));
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f",spendMoney);

    }
}

