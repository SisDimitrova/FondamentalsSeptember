package AssociativeArraysExercises;

import java.util.*;
import java.util.stream.Collectors;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        LinkedHashMap<String, Integer> quantityProducts = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceProducts = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split(" ")[0];
            int quantity = Integer.parseInt(data.split(" ")[2]);
            double price = Double.parseDouble(data.split(" ")[1]);

            if (!quantityProducts.containsKey(product)) {
                quantityProducts.put(product, quantity);
            } else {
                int currentQuantity = quantityProducts.get(product);
                quantityProducts.put(product, currentQuantity + quantity);
            }
            priceProducts.put(product, price);

            data = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : quantityProducts.entrySet()) {
            String nameProducts = entry.getKey();
            double sum = quantityProducts.get(nameProducts) * priceProducts.get(nameProducts);
            System.out.printf("%s -> %.2f%n", nameProducts, sum);
        }
    }
}
