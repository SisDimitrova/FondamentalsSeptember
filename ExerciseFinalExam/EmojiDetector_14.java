package MyWorkFinishExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String thresholdRegex = "\\d";
        Pattern pattern = Pattern.compile(thresholdRegex);
        Matcher matcher = pattern.matcher(input);

        int threshold = 1;
        while (matcher.find()) {

            threshold *= Integer.parseInt(matcher.group());
        }
        System.out.printf("Cool threshold: %d%n", threshold);

        String validEmojiRegex = "(::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern1 = Pattern.compile(validEmojiRegex);
        Matcher matcher1 = pattern1.matcher(input);

        List<String> validEmojis = new ArrayList<>();
      while (matcher1.find()) {
          validEmojis.add(matcher1.group());
      }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", validEmojis.size());

        for (String emojis : validEmojis) {
            int coolness = 0;
            for (int i = 0; i < emojis.length(); i++) {
                char symbol = emojis.charAt(i);
                if (Character.isLetter(symbol)) {
                    coolness += symbol;
                }
            }
            if (coolness >= threshold) {
                System.out.println(emojis);
            }
        }


    }
}
