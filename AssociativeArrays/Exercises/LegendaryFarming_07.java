package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        LinkedHashMap<String, Integer> junks = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split("\\s+");

            for (int idx = 0; idx < inputData.length -1; idx+= 2) {
                int quantity = Integer.parseInt(inputData[idx]);
                String material = inputData[idx +1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);
                } else {
                    if (junks.containsKey(material)) {
                       int currentQuantity = junks.get(material);
                       junks.put(material, currentQuantity + quantity);
                    } else {
                        junks.put(material, quantity);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
           if (isWin) {
               break;
           }
        }

           materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junks.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
