package NestedCycles;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        double taxaInput = Double.parseDouble(scanner.nextLine());
        double priceLounge = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double priceTaxa = countPeople * taxaInput;
        double countLounge = Math.ceil(countPeople * 0.75);
        double countUmbrella = Math.ceil(countPeople / 2.0);
        double totalSum = priceTaxa + countLounge * priceLounge + countUmbrella * priceUmbrella;

        System.out.printf("%.2f lv.", totalSum);

    }
}
