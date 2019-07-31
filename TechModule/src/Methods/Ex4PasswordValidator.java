package Methods;

import java.util.Scanner;

public class Ex4PasswordValidator {

    public static void passwordValidatorFalse(String input) {
        boolean between6And10 = true;
        boolean onlyLettersAndDigits = true;
        boolean haveAtLeast2digits = true;
        int count = 0;
        if (input.length() >= 6 && input.length() <= 10) {

        } else {
            between6And10 = false;
        }

        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 65 && input.charAt(i) <= 90) || (input.charAt(i) >= 97 && input.charAt(i) <= 122) || (input.charAt(i) >= 48 && input.charAt(i) <= 57)) {

            } else {
                onlyLettersAndDigits = false;
                break;
            }

        }
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                count++;

            }
        }
        if (count < 2) {
            haveAtLeast2digits = false;
        }

        if (between6And10 && onlyLettersAndDigits && haveAtLeast2digits) {
            System.out.println("Password is valid");
        }
        if (!between6And10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!onlyLettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveAtLeast2digits) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        passwordValidatorFalse(input);
    }
}
