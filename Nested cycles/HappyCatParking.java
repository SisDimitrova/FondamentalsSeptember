package NestedCycles;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        int countHours = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        double totalSum = 0.0;


        for (int i = 1; i <= countDays ; i++) {
            for (int j = 1; j <= countHours ; j++) {
                if (i % 2 == 0 && j % 2 !=0) {
                    sum += 2.5;
                    totalSum += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                    totalSum += 1.25;
                } else {
                    sum += 1;
                    totalSum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, sum);
            sum = 0;
        }
        System.out.printf("Total: %.2f leva", totalSum);

    }
}
