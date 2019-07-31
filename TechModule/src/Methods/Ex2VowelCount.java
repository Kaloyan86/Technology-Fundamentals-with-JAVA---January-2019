package Methods;

import java.util.Scanner;

public class Ex2VowelCount {
    public static int vowelCount(String inp, char[] input) {
        int counter = 0;
        input = inp.toLowerCase().toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 97 || input[i] == 101 || input[i] == 105
                    || input[i] == 111 || input[i] == 113 || input[i] == 117 || input[i] == 121) {
                counter++;
            }

        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        char[]input=inp.toLowerCase().toCharArray();
        System.out.println(vowelCount(inp,input));

    }
}
