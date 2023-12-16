package MyWorkFinishExam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder massage = new StringBuilder(text);

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Reveal")) {
                break;
            }
            String[] commandArg = command.split(":\\|:");
            String commandName = commandArg[0];
            switch (commandName) {
                case "InsertSpace":
                    int idx = Integer.parseInt(commandArg[1]);
                    massage.insert(idx, " ");
                    System.out.println(massage);
                    break;
                case "Reverse":
                    String substring = commandArg[1];
                    if (massage.toString().contains(substring)) {
                        int index = massage.indexOf(substring);
                        massage.delete(massage.indexOf(substring), massage.indexOf(substring) + substring.length());
                        String reversedText = "";
                        for (int i = substring.length() - 1; i >= 0 ; i--) {
                            reversedText += substring.charAt(i);
                        }
                        massage.append(reversedText);
                        System.out.println(massage);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subString = commandArg[1];
                    String replacement = commandArg[2];
                    String newMassage = Pattern.compile(subString).matcher(massage).replaceAll(replacement);
                    massage.replace(0, massage.length(), newMassage);
                    System.out.println(massage);
                    break;
            }
        }
        System.out.printf("You have a new text message: %s", massage);
    }
}
