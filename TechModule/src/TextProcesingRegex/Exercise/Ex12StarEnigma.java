package TextProcesingRegex.Exercise;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12StarEnigma {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String regex1 = "[SsTtAaRr]";
            String regex2 = "^(?:[^@\\-!:>]*)@([A-Za-z]+)(?:[^@\\-!:>]*):([\\d]+)(?:[^@\\-!:>]*)!([AD])+!(?:[^@\\-!:>]*)->([\\d]+)(?:[^@\\-!:>]*)$";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(input);
            String insensitive = "";
            while (matcher1.find()) {
                insensitive += matcher1.group();

            }
            String decrypted = "";
            for (int j = 0; j < input.length(); j++) {
                char symbol = (char) (input.charAt(j) - insensitive.length());
                decrypted += symbol;
            }
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(decrypted);
            while (matcher2.find()) {
                String planet = matcher2.group(1);
                String attack = matcher2.group(3);

                if ("A".equals(attack)) {
                    attacked.add(planet);

                } else {
                    destroyed.add(planet);

                }
            }

        }
        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.stream().sorted().forEach(planet -> System.out.println("-> " + planet));

        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
    }
}
