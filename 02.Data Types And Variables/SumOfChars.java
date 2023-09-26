package DataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLines = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;

        for (int i = 1; i <= countLines ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            totalSum += (int) symbol;
        }
        System.out.println("The sum equals: " + totalSum);
    }
}
