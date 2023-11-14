package AssociativeArraysExercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class PlantDiscovery_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPlants = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Integer> plantsRarity = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 1; i <= countPlants ; i++) {
            String input = scanner.nextLine();
            String name = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantsRarity.put(name, rarity);
            plantsRating.putIfAbsent(name, new ArrayList<>());

        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String name = command.split(" ")[1];
            if (!plantsRarity.containsKey(name)) {
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }
            if (command.contains("Rate")) {

                double rating = Double.parseDouble(command.split(" ")[3]);
                plantsRating.get(name).add(rating);

            } else if (command.contains("Update")) {

                int newRarity = Integer.parseInt(command.split(" ")[3]);
                plantsRarity.put(name, newRarity);

            } else if (command.contains("Reset")) {
                plantsRating.get(name).clear();
            }

            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantsRating.get(name).stream().mapToDouble(a -> a).average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, averageRating);
        } );
    }
}
