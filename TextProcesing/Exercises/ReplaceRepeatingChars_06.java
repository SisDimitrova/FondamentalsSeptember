package TextProcessingExercises;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder textResult = new StringBuilder();
        textResult.append(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {
            char oldPosition = input.charAt(i - 1);
            char newPosition = input.charAt(i);
            if (oldPosition != newPosition) {
                textResult.append(newPosition);
            }
        }
        System.out.printf("%s", textResult);
    }
}
