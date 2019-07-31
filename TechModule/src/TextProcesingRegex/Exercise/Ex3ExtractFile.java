package TextProcesingRegex.Exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex3ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separator = "\\";
        String separator2 = ".";
        String[] input = scanner.nextLine().split(Pattern.quote(separator));
        String file = input[input.length - 1];

        String fileName = file.substring(0, file.lastIndexOf('.'));
        String fileExtension  = file.substring(file.lastIndexOf('.') + 1);

        System.out.println(String.format("File name: %s\nFile extension: %s", fileName, fileExtension));
    }
}
