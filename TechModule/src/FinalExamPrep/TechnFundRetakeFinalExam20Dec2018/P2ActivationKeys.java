package FinalExamPrep.TechnFundRetakeFinalExam20Dec2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split("&");
        String regex = "^[A-Za-z0-9]+$";
        List<String> result = new ArrayList<>();
        int count1 = 1;
        int count2 = 1;
        for (int i = 0; i < input.length; i++) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input[i]);
            if (matcher.find()) {
                if (input[i].length() == 16) {
                    String key = "";
                    for (int j = 0; j < input[i].length(); j++) {
                        char symbol = input[i].charAt(j);
                        if (Character.isDigit(symbol)) {
                            int digit = 9 - Character.getNumericValue(symbol);
                            key += digit;
                        } else {
                            key += Character.toString(symbol).toUpperCase();

                        }
                        if (count1 % 4 == 0) {
                            if (count1 == input[i].length()) {
                                break;
                            }
                            key += "-";
                        }
                        count1++;
                    }
                    count1 = 1;
                    result.add(key);
                } else if (input[i].length() == 25) {
                    String key = "";
                    for (int j = 0; j < input[i].length(); j++) {
                        char symbol = input[i].charAt(j);
                        if (Character.isDigit(symbol)) {
                            int digit = 9 - Character.getNumericValue(symbol);
                            key += digit;
                        } else {
                            key += Character.toString(symbol).toUpperCase();
                        }
                        if (count2 % 5 == 0) {
                            if (count2 == input[i].length()) {
                                break;
                            }
                            key += "-";
                        }
                        count2++;
                    }
                    count2 = 1;
                    result.add(key);
                }
            }

        }

        System.out.println(result.toString().replaceAll("[\\[\\]]",""));
    }
}
