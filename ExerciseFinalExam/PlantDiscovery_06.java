package MyWorkFinishExam;

import java.util.*;

public class PlantDiscovery_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String plantName = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantRarity.put(plantName, rarity);
            plantRating.putIfAbsent(plantName, new ArrayList<>());
        }
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Exhibition")) {
                break;
            }
            String plantName = line.split(" ")[1];
            if (!plantRarity.containsKey(plantName)) {
                System.out.println("error");
                line = scanner.nextLine();
                continue;
            }
            if (line.contains("Rate")) {
                double rating = Double.parseDouble(line.split(" ")[3]);
                plantRating.get(plantName).add(rating);

            } else if (line.contains("Update")) {
                int newRarity = Integer.parseInt(line.split(" ")[3]);
                plantRarity.put(plantName, newRarity);

            } else if (line.contains("Reset")) {
               plantRating.get(plantName).clear();
            }
        }
        System.out.println("Plants for the exhibition:");
        plantRarity.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantRating.get(name).stream().mapToDouble(a->a).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, averageRating);
        });
    }
}
