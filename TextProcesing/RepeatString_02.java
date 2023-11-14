package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.nextLine().split(" ");

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < word.length; i++) {
            String currentWord = word[i];

            String repeatWord = repeatString(currentWord);
            resultList.add(repeatWord);
        }

        System.out.println(String.join("", resultList));
    }
    public static String repeatString( String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word;
        }
        return result;
    }
}
