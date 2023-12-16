package MyWorkFinishExam;

import java.util.*;

public class NeedForSpeed_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int countCar = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsData = new LinkedHashMap<>();

        for (int i = 1; i <= countCar ; i++) {
            String[] carDescription = scanner.nextLine().split("\\|");
            String carName = carDescription[0];
            int mileage = Integer.parseInt(carDescription[1]);
            int fuel = Integer.parseInt(carDescription[2]);

            carsData.putIfAbsent(carName, new ArrayList<>());
            carsData.get(carName).add(0, mileage);
            carsData.get(carName).add(1, fuel);
        }

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("Stop")) {
                    break;
                }
                String[] command = input.split(" : ");
                String commandArg = command[0];
                switch (commandArg) {
                    case "Drive":
                        String car = command[1];
                        int distance = Integer.parseInt(command[2]);
                        int fuelConsumed = Integer.parseInt(command[3]);

                        int currentFuel = carsData.get(car).get(1);
                        int currentKm = carsData.get(car).get(0);
                        if (currentFuel <= fuelConsumed) {
                            System.out.println("Not enough fuel to make that ride");
                        } else {
                            carsData.get(car).set(1, currentFuel - fuelConsumed);
                            carsData.get(car).set(0, distance + currentKm);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuelConsumed);
                        }
                        if (carsData.get(car).get(0) >= 100_000) {
                            System.out.printf("Time to sell the %s!%n", car);
                            carsData.remove(car);
                        }
                        break;
                    case "Refuel":
                        String chargingCar = command[1];
                        int quantityFuel = Integer.parseInt(command[2]);

                        int currentQuantity = carsData.get(chargingCar).get(1);
                        if (quantityFuel + currentQuantity > 75) {
                            carsData.get(chargingCar).set(1, 75);
                            System.out.printf("%s refueled with %d liters%n", chargingCar, 75 - currentQuantity);
                        } else {
                            carsData.get(chargingCar).set(1, quantityFuel + currentQuantity);
                            System.out.printf("%s refueled with %d liters%n", chargingCar, quantityFuel);
                        }
                        break;
                    case "Revert":
                        String revertCar = command[1];
                        int kilometers = Integer.parseInt(command[2]);

                        int currentKilometres = carsData.get(revertCar).get(0);
                        int kmRevert = currentKilometres - kilometers;

                        if (kmRevert < 10_000) {
                            kmRevert = 10_000;
                        } else {
                            System.out.printf("%s mileage decreased by %d kilometers%n", revertCar, kilometers);
                        }
                        carsData.get(revertCar).set(0, kmRevert);
                        break;
                }
            }

            carsData.entrySet().forEach(entry -> {
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0),
                        entry.getValue().get(1));
            });

    }
}
