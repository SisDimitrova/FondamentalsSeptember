package MyWorkFinishExam;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder massage = new StringBuilder(text);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Decode")) {
                break;
            }
            String[] command = input.split("\\|");
            String commandName = command[0];
            switch (commandName){
                case "Move":
                    int numberOfLetter = Integer.parseInt(command[1]);
                    for (int i = 1; i <= numberOfLetter ; i++) {
                        char getLetter = massage.charAt(0);
                        massage.deleteCharAt(0);
                        massage.append(getLetter);
                    }
                    break;
                case "Insert":
                    int idx = Integer.parseInt(command[1]);
                    String replaceChar = command[2];
                    massage.insert(idx, replaceChar);
                    break;
                case "ChangeAll":
                    char substring = command[1].charAt(0);
                    String newSubstring = command[2];
                    for (int i = 0; i < massage.length(); i++) {
                        if (massage.charAt(i) == substring) {
                            massage.replace(i, i+1, newSubstring);
                        }
                    }
                    break;
            }
        }
        System.out.printf("The decrypted message is: %s", massage);
    }
}