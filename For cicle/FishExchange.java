package FORCICLE;

import java.util.Scanner;

public class FishExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerelKg = Double.parseDouble(scanner.nextLine());
        double priceSpratKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackerelKg = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double priceBonitoKg = priceMackerelKg + priceMackerelKg * 0.60;
        double sumBonito = bonitoKg * priceBonitoKg;
        double priceHorseMackerel = priceSpratKg + priceSpratKg * 0.80;
        double sumHorseMackerel = priceHorseMackerel * horseMackerelKg;
        double sumMussels = mussels * 7.50;
        double totalSum = sumBonito + sumMussels + sumHorseMackerel;
        System.out.printf("%.2f", totalSum);
    }
}
