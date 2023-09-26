package DataTypesAndVariables;

import java.util.Scanner;

public class SpaceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpices = 0;

        while (startingYield >= 100) {
            days++;
            int spicesPerDay = startingYield - 26;
            totalSpices += spicesPerDay;
            startingYield -= 10;

        }
        totalSpices -= 26;
        if (totalSpices < 0) {
            totalSpices = 0;
        }
        System.out.println(days);
        System.out.println(totalSpices);

    }
}
