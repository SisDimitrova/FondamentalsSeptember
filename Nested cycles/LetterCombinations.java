package NestedCycles;

import java.util.Scanner;

public class LetterCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char fromSymbol = scanner.nextLine().charAt(0);
        char toSymbol = scanner.nextLine().charAt(0);
        char toIgnore = scanner.nextLine().charAt(0);
        int counter = 0;

        for (char i = fromSymbol; i <= toSymbol ; i++) {
            for (char j = fromSymbol; j <=toSymbol ; j++) {
                for (char k = fromSymbol; k <= toSymbol ; k++) {
                    if (i!= toIgnore && j!= toIgnore && k!= toIgnore) {
                        System.out.print("" + i + j + k + " ");
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
