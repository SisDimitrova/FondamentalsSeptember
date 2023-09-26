package FORCICLE;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double litresFuel = Double.parseDouble(scanner.nextLine());

        if (typeOfFuel.equals("Diesel") || typeOfFuel.equals("Gasoline") || typeOfFuel.equals("Gas")) {
            if (litresFuel >= 25) {
                System.out.printf("You have enough %s.", typeOfFuel.toLowerCase());
            } else if (litresFuel < 25) {
                System.out.printf("Fill your tank with %s!", typeOfFuel.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
