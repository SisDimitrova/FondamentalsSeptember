package MethodsExercises;

import java.util.Scanner;

public class charactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolRange(firstSymbol,secondSymbol);
    }

    public static void printSymbolRange (char first,char second) {
        if (first < second) {
            for (char symmbol = (char) (first + 1); symmbol < second; symmbol++) {
                System.out.print(symmbol + " ");
            }
        } else {
            for (char symmbol = (char) (second + 1); symmbol < first; symmbol++) {
                System.out.print(symmbol + " ");
            }
        }
    }
}
