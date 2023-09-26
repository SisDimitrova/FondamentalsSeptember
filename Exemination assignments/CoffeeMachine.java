package ExaminationAssignments;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drinks = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (drinks) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price += countDrinks * 0.9;
                    price *= 0.65;
                } else if (sugar.equals("Normal")) {
                    price += countDrinks * 1.0;
                } else if (sugar.equals("Extra")) {
                    price += countDrinks * 1.2;
                }
                if (countDrinks >= 5) {
                    price *= 0.75;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price += countDrinks * 1.0;
                    price *= 0.65;
                } else if (sugar.equals("Normal")) {
                    price += countDrinks * 1.20;
                } else if (sugar.equals("Extra")) {
                    price += countDrinks * 1.6;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price += countDrinks * 0.5;
                    price *= 0.65;
                } else if (sugar.equals("Normal")) {
                    price += countDrinks * 0.60;
                } else if (sugar.equals("Extra")) {
                    price += countDrinks * 0.7;
                }
                break;
        }
        if (price > 15) {
            price *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrinks, drinks, price);
    }
}
