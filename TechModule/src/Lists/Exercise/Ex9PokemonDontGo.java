package Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex9PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" +"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < pokemons.size()) {
                int removedElement = pokemons.get(index);
                sum += removedElement;
                pokemons.remove(index);
                changeListElements(pokemons, removedElement);
            } else if (index < 0) {
                int removedElement = pokemons.get(0);
                sum += removedElement;
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
                changeListElements(pokemons, removedElement);

            } else {
                int removedElement = pokemons.get(pokemons.size() - 1);
                sum += removedElement;
                pokemons.set(pokemons.size() - 1, pokemons.get(0));
                changeListElements(pokemons,removedElement);

            }


        }
        System.out.println(sum);
    }

    public static void changeListElements(List<Integer> pokemons, int removedElement) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i) <= removedElement) {
                pokemons.set(i, pokemons.get(i) + removedElement);
            } else {
                pokemons.set(i, pokemons.get(i) - removedElement);
            }

        }
    }
}
