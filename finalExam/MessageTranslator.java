package Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countMassage = Integer.parseInt(scanner.nextLine());

        String regex = "!(?<commandName>[A-Z][a-z]{2,})!:(?<command>\\[[A-Za-z]{8,}\\])";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < countMassage; i++) {
            String massage = scanner.nextLine();
            Matcher matcher = pattern.matcher(massage);
            if (matcher.find()) {
                String commandName = matcher.group("commandName");
                String command = matcher.group("command");
                StringBuilder sbLetterCategory = new StringBuilder();
                for (char symbol : command.toCharArray()) {
                    if (Character.isLetter(symbol)) {
                        sbLetterCategory.append((int)symbol + " ");
                    }
                }
                System.out.println(commandName + ": " + sbLetterCategory);

            } else {
                System.out.println("The message is invalid");
            }
        }




    }
}
