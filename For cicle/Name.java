package FORCICLE;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int salesSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int count = 0;
        int cash = 0;
        int card = 0;
        int price = 0;
        int cashPerson = 0;
        int cardPerson = 0;
        int allPrice = 0;

        while (!input.equals("End")) {
            price = Integer.parseInt(input);
            count++;
            if (count % 2 == 0) {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    cardPerson++;
                    card += price;
                    System.out.println("Product sold!");
                    allPrice += price;
                }
            } else {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    cashPerson++;
                    cash += price;
                    System.out.println("Product sold!");
                    allPrice += price;
                }
            }
              if (allPrice >= salesSum){
                  break;
              }

            input = scanner.nextLine();
        }
        if (allPrice < salesSum) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            double sumCash = cash * 1.0 / cashPerson;
            double sumCard = card * 1.0 / cardPerson;
            System.out.printf("Average CS: %.2f%n" ,sumCash);
            System.out.printf("Average CC: %.2f" ,sumCard);
        }
    }
}
