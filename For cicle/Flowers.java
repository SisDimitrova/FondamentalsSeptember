package FORCICLE;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemums = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        
        double priceChrysanthemums = 0.0;
        double priceRoses = 0.0;
        double priceTulips = 0.0;
        double allPrice = 0.0;
        
        if (season.equals("Spring") || season.equals("Summer")) {
            priceChrysanthemums = countChrysanthemums * 2.0;
            priceRoses = countRoses * 4.10;
            priceTulips = countTulips * 2.50;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            priceChrysanthemums = countChrysanthemums * 3.75;
            priceRoses = countRoses * 4.50;
            priceTulips = countTulips * 4.15;
        }
        allPrice = priceChrysanthemums + priceRoses + priceTulips;

        if (holiday.equals("Y")) {
            allPrice += allPrice * 0.15;
        } else {

        }
        if (season.equals("Spring") && countTulips > 7) {
            allPrice -= allPrice * 0.05;
        } else if (season.equals("Winter") && countRoses >= 10) {
            allPrice -= allPrice * 0.1;
        }
        if (countChrysanthemums + countRoses + countTulips >= 20) {
            allPrice -= allPrice * 0.2;
        }
        double priceBouquet = allPrice + 2;
        System.out.printf("%.2f", priceBouquet);

    }
}
