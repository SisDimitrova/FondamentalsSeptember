package FondamentalsOneExercises;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double sumSaber = Math.ceil(countStudents + countStudents * 0.1) * priceSaber;
        double sumRobes = priceRobes * countStudents;
        double sumBelts = (countStudents - countStudents / 6) * priceBelts;
        double totalSum = sumBelts + sumRobes + sumSaber;
        if (budget >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - budget);
        }


    }
}
