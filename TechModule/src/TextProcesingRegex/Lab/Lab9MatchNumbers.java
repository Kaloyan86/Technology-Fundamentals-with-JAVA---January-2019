package TextProcesingRegex.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab9MatchNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String regex = "(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher numbers = pattern.matcher(input);
        List<String> matches = new ArrayList<>();

        while (numbers.find()) {
            matches.add(numbers.group());
        }
        System.out.println(String.join(" ",matches));
    }
}
