package Final_Exam;

import java.util.Locale;
import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String spell = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Abracadabra")) {
                break;
            }
            String[] command = line.split(" ");
            String commandName = command[0];
            switch (commandName) {
                case "Abjuration":
                    spell = spell.toUpperCase();
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = spell.toLowerCase();
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int idx = Integer.parseInt(command[1]);
                    String letter = command[2];
                    if (idx >= 0 && idx <= spell.length() - 1) {
                        String takenLetter = spell.substring(idx, idx + 1);
                        String replaceSpell = spell.replace(takenLetter, letter);
                        spell = replaceSpell;
                        System.out.println("Done!");

                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = command[1];
                    String secondSubstring = command[2];
                    spell = spell.replaceFirst(firstSubstring, secondSubstring);
                    System.out.println(spell);
                    break;
                case "Alteration":
                    String substring = command[1];
                    if (!spell.contains(substring)) {
                        System.out.println("The spell did not work!");
                    } else {
                        spell = spell.replace(substring, "");
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
        }
    }
}
