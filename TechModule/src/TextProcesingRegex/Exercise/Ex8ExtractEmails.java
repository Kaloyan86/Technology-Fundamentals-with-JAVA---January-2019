package TextProcesingRegex.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex8ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "\\s[A-Za-z][\\w.-]+@[A-za-z-]+(\\.[A-Za-z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group().trim());
        }
    }
}