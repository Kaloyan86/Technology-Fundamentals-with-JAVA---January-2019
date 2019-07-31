package TextProcesingRegex.Lab;

import java.util.Scanner;

public class Lab4TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWords) {
            if (text.contains(banWord)) {
                String asterisks = repeatStr("*", banWord.length());

                text = text.replace(banWord, asterisks);
            }
        }
        System.out.println(text);
    }

    public static String repeatStr(String str, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += str;
        }
        return replacement;
    }
}
