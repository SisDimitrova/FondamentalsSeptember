package FondamentalsOneExercises;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0.0;

        for (int order = 1; order <= countOrders ; order++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double priceForOrder = ((days * capsulesCount) * pricePerCapsule);

            System.out.printf("The price for the coffee is: $%.2f%n", priceForOrder);
            totalPrice += priceForOrder;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
