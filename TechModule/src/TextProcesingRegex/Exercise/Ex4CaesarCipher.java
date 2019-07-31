package TextProcesingRegex.Exercise;

        import java.util.Scanner;

public class Ex4CaesarCipher {
    public static String code(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = (char) (input.charAt(i)+3);
            result.append(symbol);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(code(input));
    }
}
