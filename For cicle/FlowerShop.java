package FORCICLE;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMagnolias = Integer.parseInt(scanner.nextLine());
        int countHyacinths = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countCacti = Integer.parseInt(scanner.nextLine());
        double priceOfTheGift = Double.parseDouble(scanner.nextLine());

        double sumMagnolias = countMagnolias * 3.25;
        double sumHyacinths = countHyacinths * 4;
        double sumRoses = countRoses * 3.50;
        double sumCacti = countCacti * 8;
        double totalSum = sumMagnolias + sumHyacinths + sumCacti + sumRoses;
        double tax = totalSum * 0.05;
        double money = totalSum - tax;
        if (money >= priceOfTheGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(money - priceOfTheGift));

        } else {
            double theyDoNotReach = Math.ceil(priceOfTheGift - money);
            System.out.printf("She will have to borrow %.0f leva.", Math.abs(theyDoNotReach));
        }

    }
}
