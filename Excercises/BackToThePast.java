package Exercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int yearsLive = Integer.parseInt(scanner.nextLine());

        int ivanYears = 17;

        for (int i = 1800; i <= yearsLive; i++){

            if (i % 2 == 0) {
                ivanYears++;
                inheritance -= 12000;
            } else {
                ivanYears++;
                inheritance -= 12000 + 50 * ivanYears;
            }
        }
        if (inheritance >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritance);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritance));
        }
    }
}
