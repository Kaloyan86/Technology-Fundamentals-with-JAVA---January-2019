package TextProcesingRegex.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^[\\w\\-\\_]{3,16}$";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);


        String [] names = input.split(", ");

        for (String name : names) {
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()){
                System.out.println(name);
            }
        }
    }
}
