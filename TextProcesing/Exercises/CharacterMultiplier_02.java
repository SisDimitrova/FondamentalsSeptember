package TextProcessingExercises;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] text = input.split(" ");
        String firstText = text[0];
        String secondText = text[1];

        printSumChar(firstText, secondText);

    }
    public static void printSumChar (String firstText, String secondText) {
        int maxLength = Math.max(firstText.length(), secondText.length());
        int minLength = Math.min(firstText.length(), secondText.length());

        int sum = 0;
        for (int position = 0; position < minLength; position++) {
           sum += (firstText.charAt(position) * secondText.charAt(position));
        }
        if (firstText.length() == secondText.length()) {
            System.out.println(sum);
        } else if (maxLength == firstText.length()) {
            for (int position = minLength; position < firstText.length() ; position++) {
                sum += firstText.charAt(position);
            }
            System.out.println(sum);
        } else {
            for (int position = minLength; position < secondText.length(); position++) {
                sum += secondText.charAt(position);
            }
            System.out.println(sum);
        }
    }
}
