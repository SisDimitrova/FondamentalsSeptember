package MethodsExercises;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printCountVowels(text);
    }
    public static void printCountVowels (String text) {
        int count = 0;

        for (char letter : text.toCharArray()) {
            if (letter == 'a' || letter == 'i' || letter == 'u' || letter == 'o' || letter == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}
