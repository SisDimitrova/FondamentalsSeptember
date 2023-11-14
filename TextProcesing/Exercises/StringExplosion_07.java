package TextProcessingExercises;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sbText = new StringBuilder(input);
        int powerStrength = 0;

        for (int position = 0; position <= sbText.length() - 1 ; position++) {
            char currentSymbol = sbText.charAt(position);
            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(sbText.charAt(position + 1) + "");
                powerStrength += explosionStrength;
            } else if (currentSymbol != '>' && powerStrength > 0) {
                sbText.deleteCharAt(position);
                powerStrength--;
                position--;
            }
        }
        System.out.println(sbText);
    }
}
