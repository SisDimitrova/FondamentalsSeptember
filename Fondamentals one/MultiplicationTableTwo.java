package FondamentalsOne;

import java.util.Scanner;

public class MultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            int result = num * multiplier;
            System.out.printf("%d X %d = %d%n", num, multiplier, result);
            multiplier++;
        } while (multiplier <= 10);
    }
}
