package AssociativeArrays.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = String.join("",scanner.nextLine().split(" "));

        Map<Character, Integer> countChars = new LinkedHashMap<>();
        for (int i = 0; i < text.length() ; i++) {
            countChars.putIfAbsent(text.charAt(i),0);
            countChars.put(text.charAt(i),countChars.get(text.charAt(i))+1);
        }
        for (Map.Entry<Character,Integer> pair : countChars.entrySet()){
            System.out.println(String.format("%s -> %d",pair.getKey(),pair.getValue()));
        }
    }
}
