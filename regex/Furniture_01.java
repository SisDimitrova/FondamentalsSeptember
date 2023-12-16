package RegexExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Purchase")) {
                break;
            }
            String validText = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
            Pattern pattern = Pattern.compile(validText);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                double pricePerFurniture = price * quantity;
                totalPrice += pricePerFurniture;

            }
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);

    }
}
