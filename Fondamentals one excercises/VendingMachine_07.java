package FondamentalsOneExercises;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumCoins = 0.0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

           input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sumCoins >= 2) {
                        System.out.println("Purchased Nuts");
                        sumCoins -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sumCoins >= 0.7) {
                        System.out.println("Purchased Water");
                        sumCoins -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sumCoins >= 1.5) {
                        System.out.println("Purchased Crisps");
                        sumCoins -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sumCoins >= 0.8) {
                        System.out.println("Purchased Soda");
                        sumCoins -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sumCoins >= 1) {
                        System.out.println("Purchased Coke");
                        sumCoins -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                 System.out.println("Invalid product");
                 break;
            }

            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
