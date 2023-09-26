package FORCICLE;

import java.util.Scanner;

public class FuelTankTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeTank = scanner.nextLine();
        double quantityTank = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double price = 0.0;

        if (card.equals("Yes")) {
            switch (typeTank) {
                case "Diesel":
                    price = quantityTank * (2.33 - 0.12);
                    break;
                case "Gasoline":
                    price = quantityTank * (2.22 - 0.18);
                    break;
                case "Gas":
                    price = quantityTank * (0.93 - 0.08);
                    break;
            }
        } else {
            switch (typeTank){
                case "Diesel":
                    price = quantityTank * 2.33 ;
                    break;
                case "Gasoline":
                    price = quantityTank * 2.22;
                    break;
                case "Gas":
                    price = quantityTank * 0.93;
                    break;
            }
        } if (quantityTank >= 20 && quantityTank <= 25) {
            price *= 0.92;
            System.out.printf("%.2f lv.", price);
        } else if (quantityTank > 25) {
            price *= 0.90;
            System.out.printf("%.2f lv.", price);
        } else {
            System.out.printf("%.2f lv.", price);
        }


    }
}
