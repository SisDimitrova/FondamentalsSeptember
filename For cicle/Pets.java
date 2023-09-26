package FORCICLE;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodForDogKg = Double.parseDouble(scanner.nextLine());
        double foodForCatKg = Double.parseDouble(scanner.nextLine());
        double foodForTortoiseGr = Double.parseDouble(scanner.nextLine());

        double necessaryFoodForADog = countDays * foodForDogKg;
        double necessaryFoodForACat = countDays * foodForCatKg;
        double necessaryFoodForATortoiseKg = countDays * (foodForTortoiseGr / 1000);
        double totalFood = necessaryFoodForADog + necessaryFoodForACat + necessaryFoodForATortoiseKg;

        if (foodLeft > totalFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - totalFood));
        } else {
            double sumFood = Math.ceil(totalFood - foodLeft);
            System.out.printf("%.0f more kilos of food are needed.", Math.abs(sumFood));
        }
    }
}
