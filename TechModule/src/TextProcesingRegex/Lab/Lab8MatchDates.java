package TextProcesingRegex.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab8MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<day>\\d{2})(\\/|\\.|\\-)(?<month>\\w{3})\\2(?<year>\\d{4})";
        String dates = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.println(String.format("Day: %s, Month: %s, Year: %s", day, month, year));
        }

    }
}
