package TextProcesingRegex.Exercise;

import java.util.Scanner;

public class Ex2CharacterMultiplier {
    public static int CharacterMultiplier(String str1, String str2) {
        int result = 0;

        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
           result+=str1.charAt(i)*str2.charAt(i);
        }

        for (int j = Math.min(str1.length(), str2.length()); j < Math.max(str1.length(), str2.length()); j++) {
            if (Math.min(str1.length(), str2.length()) == str1.length()) {
                result += str2.charAt(j);
            } else {
                result += str1.charAt(j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String str1 = input[0];
        String str2 = input[1];

        System.out.println(CharacterMultiplier(str1, str2));

    }

}
