package Final_Exam;

import java.util.*;

public class WildZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> nameAnimalNeededFood = new LinkedHashMap<>();
        Map<String, String> animalArea = new LinkedHashMap<>();
        Map<String, Integer> mapToPrint = new LinkedHashMap<>();


        while (true) {
            String line = scanner.nextLine();
            if (line.equals("EndDay")) {
                break;
            }
            String[] command = line.split("[:\\-]");
            String animalArg = command[0];
            String animalName = command[1];
            switch (animalArg) {
                case "Add":
                    int neededFood = Integer.parseInt(command[2]);
                    String area = command[3];
                    if (!nameAnimalNeededFood.containsKey(animalName) || !animalArea.containsKey(animalName)) {
                        nameAnimalNeededFood.put(animalName, neededFood);
                        animalArea.put(animalName, area);
                    } else {
                        nameAnimalNeededFood.put(animalName, nameAnimalNeededFood.get(animalName) + neededFood);
                    }
                    break;
                case "Feed":
                    int food = Integer.parseInt(command[2]);

                    if (nameAnimalNeededFood.containsKey(animalName)) {
                        nameAnimalNeededFood.put(animalName, nameAnimalNeededFood.get(animalName) - food);
                        if (nameAnimalNeededFood.get(animalName) <= 0) {
                            System.out.printf("%s was successfully fed%n", animalName);
                            nameAnimalNeededFood.remove(animalName);
                            animalArea.remove(animalName);
                        }
                    }
                    break;
            }
        }
        System.out.println("Animals:");
        nameAnimalNeededFood.entrySet().forEach(entry ->{
            String name = entry.getKey();
            int food = entry.getValue();
            System.out.printf("%s -> %dg%n", name, food);
        });
        System.out.println("Areas with hungry animals:");

        for (Map.Entry<String,String> entry : animalArea.entrySet()) {
            String areaTooAdd = animalArea.get(entry.getKey());
            if (!mapToPrint.containsKey(areaTooAdd)) {
                mapToPrint.put(areaTooAdd, 1);
            } else {
                mapToPrint.put(areaTooAdd, mapToPrint.get(areaTooAdd) + 1);
            }
        }
        mapToPrint.entrySet().forEach(entry-> System.out.printf(" %s: %d%n", entry.getKey(), entry.getValue()));
    }
}
