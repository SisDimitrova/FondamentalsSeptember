package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int startPower = pokePower;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int countPoked = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            countPoked++;
            if (pokePower == startPower / 2 && exhaustionFactor != 0) {
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(countPoked);
    }
}
