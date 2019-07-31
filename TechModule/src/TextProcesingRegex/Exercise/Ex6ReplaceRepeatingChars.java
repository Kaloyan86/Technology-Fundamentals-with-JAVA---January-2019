package TextProcesingRegex.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        for (int i = 0; i < input.size()-1; i++) {

            while (input.get(i).equals(input.get(i + 1))) {
                input.remove(i);
                if (input.size() - 1 == i){
                    break;
                }
            }

        }
        System.out.println(String.join("",input));
    }
}