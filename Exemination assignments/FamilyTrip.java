package ExaminationAssignments;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double priceNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalCosts = Integer.parseInt(scanner.nextLine());

        if (countNights > 7) {
            priceNight = priceNight * 0.95;
        }
        double sumTheNights = countNights * priceNight;
        double percent = budget * (1.0 * percentAdditionalCosts / 100);
        double totalPrice = sumTheNights + percent;
        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(budget - totalPrice));
        }

    }
}
