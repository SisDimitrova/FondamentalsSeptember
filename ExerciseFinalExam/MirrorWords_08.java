package MyWorkFinishExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([#|@])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> validWords = new ArrayList<>();
        int countValidWords = 0;

        while (matcher.find()) {
            String oneWord = matcher.group("wordOne");
            String twoWord = matcher.group("wordTwo");
            countValidWords ++;

            String reversedTwoWord = new StringBuilder(twoWord).reverse().toString();
            if (oneWord.equals(reversedTwoWord)) {
                validWords.add(oneWord + " <=> " + twoWord);
            }
        }
        if (countValidWords == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", countValidWords);
        }
        if (validWords.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", validWords));
        }
    }
}
