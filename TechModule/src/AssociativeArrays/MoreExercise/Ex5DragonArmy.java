package AssociativeArrays.MoreExercise;

import java.util.*;

public class Ex5DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int defaultHealth = 250;
        int defaultDamage = 45;
        int defaultArmor = 10;

        LinkedHashMap<String, TreeMap<String, List<Double>>> dragonArmy = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String type = input[0];
            String name = input[1];
            double damage = input[2].equals("null") ? defaultDamage : Double.parseDouble(input[2]);
            double health = input[3].equals("null") ? defaultHealth : Double.parseDouble(input[3]);
            double armor = input[4].equals("null") ? defaultArmor : Double.parseDouble(input[4]);

            List<Double> stats = new ArrayList<>();
            stats.add(damage);
            stats.add(health);
            stats.add(armor);
            if (!dragonArmy.containsKey(type)) {
                dragonArmy.put(type, new TreeMap<>());
            }
            if (!dragonArmy.get(type).containsKey(name)) {
                dragonArmy.get(type).put(name, new ArrayList<>());
            }
            dragonArmy.get(type).get(name).clear();
            dragonArmy.get(type).get(name).addAll(stats);
        }

        dragonArmy.forEach((key, value) -> {
            double armor = 0;
            double health = 0;
            double damage = 0;

            TreeMap<String, List<Double>> statsDragons = value;

            for (List<Double> stats : statsDragons.values()) {
                damage += stats.get(0);
                health += stats.get(1);
                armor += stats.get(2);
            }
            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", key
                    , damage / statsDragons.size()
                    , health / statsDragons.size()
                    , armor / statsDragons.size()
            ));
            statsDragons.forEach((d, s) -> {
                System.out.println(
                        String.format(
                                "-%s -> damage: %.0f, health: %.0f, armor: %.0f",
                                d, s.get(0), s.get(1), s.get(2)));
            });
        });
    }
}
