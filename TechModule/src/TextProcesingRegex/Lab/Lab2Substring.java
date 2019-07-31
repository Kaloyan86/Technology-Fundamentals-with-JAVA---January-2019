package TextProcesingRegex.Lab;

import java.util.Scanner;

public class Lab2Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String keyWord = scanner.nextLine();
        String text = scanner.nextLine();

        int indexOfFirst = text.indexOf(keyWord);

        while (indexOfFirst != -1) {

            text = text.substring(0,indexOfFirst) +text.substring(indexOfFirst+keyWord.length());


            indexOfFirst = text.indexOf(keyWord);
        }
        System.out.println(text);
    }
}
