package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int countProduct = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (product){
            case "coffee":
                price = 1.5;
                printPrice(countProduct,price);
                break;
            case "water":
                price = 1.0;
                printPrice(countProduct,price);
                break;
            case "coke":
                price = 1.4;
                printPrice(countProduct,price);
                break;
            case "snacks":
                price = 2.0;
                printPrice(countProduct,price);
                break;

        }


    }
    public static void printPrice(int countProduct, double price) {
        double result = countProduct * price;
        System.out.printf("%.2f", result);
    }
}
