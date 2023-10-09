package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }
    public static void printMiddleCharacters (String text) {
        int length = text.length();
        if (length % 2 != 0) {
            int indexOfMiddleCharacter = length / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            int firstMiddleCharacter = length / 2 - 1;
            int secondMiddleCharacter = length / 2;
            System.out.print(text.charAt(firstMiddleCharacter));
            System.out.print(text.charAt(secondMiddleCharacter));
        }
    }

}
