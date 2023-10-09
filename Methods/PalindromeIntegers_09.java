package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            System.out.println(checkPalindrome(command));

            command = scanner.nextLine();
        }
    }
    public static boolean checkPalindrome (String text) {
        String reversedText = "";
        for (int index = text.length() - 1; index >= 0 ; index--) {
            reversedText += text.charAt(index);

        }
        return text.equals(reversedText);
    }
}
