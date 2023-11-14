package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("end")) {
                break;
            }
            String wordReverse = "";
            for (int i = text.length() - 1; i >= 0 ; i--) {
                char symbol = text.charAt(i);

                wordReverse += symbol;
            }
            System.out.printf("%s = %s%n", text, wordReverse);
        }

    }
}
