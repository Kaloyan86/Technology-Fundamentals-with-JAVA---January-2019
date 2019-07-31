package TextProcesingRegex.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> field = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        int bomb = 0;
        for (int i = 0; i < field.size(); i++) {
            if (bomb > 0 && !field.get(i).equals(">")) {
                field.remove(i); // Remove char on this index
                bomb--; // One bomb is used
                i--; // after remove next char is moved 1 position, so return counter i to this char, decreasing i by 1
            } else if (field.get(i).equals(">")) {
                bomb += Integer.parseInt(field.get(i + 1)); // takes the digit after '>' - bomb strength and add to bomb
            }
        }
        System.out.println(String.join("",field));
    }
}
