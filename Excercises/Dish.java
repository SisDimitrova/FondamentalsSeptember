package Exercises;

import java.util.Scanner;

public class Dish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());

        double preparation = bottles * 750;

        int allPots = 0;
        int allPlates = 0;
        int counter = 1;


         String command = scanner.nextLine();
        while (!command.equals("End")) {
            int countVessels = Integer.parseInt(command);
            int plates = 0;
            int pots = 0;

            if (counter % 3 == 0) {
                pots = countVessels * 15;
                preparation -= pots;
                allPots += countVessels;
            } else {
                plates = countVessels * 5;
                preparation -= plates;
                allPlates += countVessels;
            }
            counter++;
            if (preparation <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (preparation <= 0) {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", Math.abs(preparation));
        } else {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %.0f ml.", allPlates, allPots, preparation);
        }


    }
}
