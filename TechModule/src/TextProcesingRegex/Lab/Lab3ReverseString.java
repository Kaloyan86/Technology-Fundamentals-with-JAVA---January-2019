package TextProcesingRegex.Lab;

import java.util.Scanner;

public class Lab3ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String reversed = "";
        while (!input.equals("end")) {
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += (input.charAt(i));
            }
            System.out.println(input+" = "+reversed);
            reversed = "";
            input = scanner.nextLine();
        }

    }
}