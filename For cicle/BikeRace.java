package FORCICLE;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJuniors = Integer.parseInt(scanner.nextLine());
        int countSeniors = Integer.parseInt(scanner.nextLine());
        String route = scanner.nextLine();

        double feeJuniors = 0.0;
        double feeSeniors = 0.0;
        double totalSum = 0.0;

        switch (route) {
            case "trail":
                feeJuniors = 5.50;
                feeSeniors = 7;
                break;
            case "cross-country":
                feeJuniors = 8;
                feeSeniors = 9.50;
                break;
            case "downhill":
                feeJuniors = 12.25;
                feeSeniors = 13.75;
                break;
            case "road":
                feeJuniors = 20;
                feeSeniors = 21.50;
                break;
        }
        totalSum = feeJuniors * countJuniors + feeSeniors * countSeniors;

        if (route.equals("cross-country") && countJuniors + countSeniors > 50) {
            totalSum -= totalSum * 0.25;
        }
        double costs = totalSum * 0.05;
        double remain = totalSum - costs;

        System.out.printf("%.2f", remain);


    }
}
