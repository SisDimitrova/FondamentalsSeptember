package DataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());

        for (int symbol = startSymbol; symbol <= lastSymbol ; symbol++) {
            System.out.print((char) symbol + " ");

        }
    }
}
