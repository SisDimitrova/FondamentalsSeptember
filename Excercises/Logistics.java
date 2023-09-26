package Exercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(scanner.nextLine());

        int bus = 0;
        int truck = 0;
        int train = 0;
        int sumTonnes = 0;
        double priceBus = 0.0;
        double priceTruck = 0.0;
        double priceTrain = 0.0;
        int countBus = 0;
        int countTruck = 0;
        int countTrain = 0;

        for (int i = 1; i <= numberOfLoads ; i++) {
            int tonnesOfCargo = Integer.parseInt(scanner.nextLine());
            sumTonnes += tonnesOfCargo;
            if (tonnesOfCargo <= 3) {
                bus = 200;
                priceBus += bus * tonnesOfCargo;
                countBus += tonnesOfCargo;
            } else if (tonnesOfCargo <= 11) {
                truck = 175;
                priceTruck += truck * tonnesOfCargo;
                countTruck += tonnesOfCargo;
            } else if (tonnesOfCargo >= 12) {
                train = 120;
                priceTrain += train * tonnesOfCargo;
                countTrain += tonnesOfCargo;
            }
        }
        System.out.printf("%.2f%n", (priceBus + priceTrain + priceTruck) / sumTonnes);
        System.out.printf("%.2f%%%n", (1.0 * countBus / sumTonnes * 100));
        System.out.printf("%.2f%%%n", (1.0 * countTruck / sumTonnes * 100));
        System.out.printf("%.2f%%", (1.0 * countTrain / sumTonnes * 100));
    }
}
