package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : banWordsArr) {
           String asterisk = repeatString(banWord);
           text = text.replace(banWord, asterisk);
        }
        System.out.println(text);
    }
    public static String repeatString(String word) {

        String result = "";
        for (int w = 0; w < word.length(); w++) {
            result += "*";
        }
        return result;
    }
}
