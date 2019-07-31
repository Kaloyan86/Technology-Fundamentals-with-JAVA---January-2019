package ObjectsAndClasses.Lab;

import java.util.Random;
import java.util.Scanner;

public class Lab1RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int pos2 = rnd.nextInt(words.length);
            String oldPos = words[i];
            words[i] = words[pos2];
            words[pos2] = oldPos;
        }
        System.out.println(String.join("\n", words));
    }
}
