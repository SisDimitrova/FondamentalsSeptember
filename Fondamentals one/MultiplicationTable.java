package FondamentalsOne;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        while (counter <= 10) {
            int result = num * counter;
            System.out.printf("%d X %d = %d%n", num, counter, result);
            counter++;
        }
    }
}
