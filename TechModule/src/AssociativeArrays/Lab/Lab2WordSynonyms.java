package AssociativeArrays.Lab;

        import java.util.*;
        import java.util.stream.Collectors;

public class Lab2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<>());
            }
            synonyms.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> wordSynonyms : synonyms.entrySet()){
            System.out.print(String.format("%s - ",wordSynonyms.getKey()));
            System.out.print(wordSynonyms.getValue().stream().collect(Collectors.joining(", ")));
            System.out.println();
        }
    }
}
