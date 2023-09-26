package Exercises;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMonths = Double.parseDouble(scanner.nextLine());

        double priceKm = 0.0;

        if (kmMonths <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")){
                priceKm = 0.75;
            } else if (season.equals("Summer")) {
                priceKm = 0.9;
            } else if (season.equals("Winter")) {
                priceKm = 1.05;
            }
        } else if (kmMonths > 5000 && kmMonths <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")){
                priceKm = 0.95;
            } else if (season.equals("Summer")) {
                priceKm = 1.1;
            } else if (season.equals("Winter")) {
                priceKm = 1.25;
            }
        } else if (kmMonths > 10000 && kmMonths <= 20000) {
            priceKm = 1.45;
        }
        double salary = kmMonths * priceKm * 4;
        double totalSum = salary - (salary * 0.1);
        System.out.printf("%.2f", totalSum);
    }
}
