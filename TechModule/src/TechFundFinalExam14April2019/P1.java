package TechFundFinalExam14April2019;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "^([A-Za-z\\d!@#$?]+)=(\\d+)<<(.*)$";


        while (!input.equals("Last note")) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            String name = "";
            int length = 0;
            String geohashcode = "";
            if (matcher.find()) {

                String encryptedName = matcher.group(1);
                for (int i = 0; i < encryptedName.length(); i++) {

                    if (encryptedName.charAt(i) >= 65 && encryptedName.charAt(i) <= 90 ||
                            encryptedName.charAt(i) >= 48 && encryptedName.charAt(i) <= 57 ||
                            encryptedName.charAt(i) >= 97 && encryptedName.charAt(i) <= 122) {

                        name += encryptedName.charAt(i);
                    }
                }
                length = Integer.parseInt(matcher.group(2));
                geohashcode = matcher.group(3);

                if (length == geohashcode.length()) {
                    System.out.println(String.format("Coordinates found! %s -> %s",name,geohashcode));
                }else {
                    System.out.println("Nothing found!");
                }
            }else {
                System.out.println("Nothing found!");
            }


            input = scanner.nextLine();
        }

    }
}
