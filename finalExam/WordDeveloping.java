package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordDeveloping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder line = new StringBuilder();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }
            String commandArg = command.split(" ")[0];
            switch (commandArg){
                case "Add":
                    String substring = command.split(" ")[1];
                    line.append(substring);
                    break;
                case "Upgrade":
                    String symbol = command.split(" ")[1];
                    char symbolNaw = symbol.charAt(0);
                    char newChar = (char) (symbolNaw + 1);
                    String currentLine = line.toString();
                    currentLine = currentLine.replace(symbolNaw, newChar);
                    line = new StringBuilder(currentLine);
                    break;
                case "Print":
                    System.out.println(line);
                    break;
                case "Index":
                    String charSymbol = command.split(" ")[1];
                    char currentSymbol = charSymbol.charAt(0);
                    List<Integer> countIdx = new ArrayList<>();
                    for (int i = 0; i < line.length(); i++) {
                        int idx = line.indexOf(charSymbol);
                        int lastIdx = line.lastIndexOf(charSymbol);
                        if (idx == i) {
                            countIdx.add(idx);
                            countIdx.add(lastIdx);
                        }
                    }
                    if (countIdx.size() == 0) {
                        System.out.println("None");
                    } else {
                        for (int item : countIdx) {
                            System.out.print(item + " ");
                        }
                        System.out.println();

                    }

                    break;
                case "Remove":
                    String sbString = command.split(" ")[1];
                    int index = line.indexOf(sbString);
                    line = line.delete(index, index + sbString.length());
                    break;
            }

        }
    }
}
