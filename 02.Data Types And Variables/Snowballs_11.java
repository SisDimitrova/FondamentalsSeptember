package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBall = Integer.parseInt(scanner.nextLine());
        double maxValue = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;


        for (int ball = 1; ball <= countBall ; ball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxValue, maxSnowballQuality);


    }
}
