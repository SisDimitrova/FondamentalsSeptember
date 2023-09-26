package FondamentalsOne;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEvenFound = false;
        while (!isEvenFound) {
            int num =Math.abs(Integer.parseInt(scanner.nextLine()));
            if (num % 2 == 0) {
                isEvenFound = true;
                System.out.printf("The number is: %d", num);
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
