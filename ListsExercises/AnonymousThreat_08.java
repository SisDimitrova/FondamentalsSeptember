package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIdx = Integer.parseInt(command.split(" ")[1]);
                int endIdx = Integer.parseInt(command.split(" ")[2]);

                if (startIdx < 0) {
                    startIdx = 0;
                }
                if (endIdx > text.size() - 1) {
                    endIdx = text.size() - 1;
                }
                if (startIdx >= 0 && startIdx <= text.size() - 1 && endIdx >= 0 && endIdx <= text.size() - 1) {
                    String result = "";
                    for (int index = startIdx; index <= endIdx; index++) {
                        String current = text.get(index);
                        result += current;
                    }
                    for (int index = startIdx; index <= endIdx; index++) {
                        text.remove(startIdx);
                    }
                    text.add(startIdx, result);

                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int countSymbol = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= text.size() - 1) {
                    String textDivide = text.get(index);
                    text.remove(index);

                    int countSymbolsPerPart = textDivide.length() / countSymbol;

                    int beginIndex = 0;
                    for (int part = 1; part < countSymbol; part++) {
                        String textPerPart = textDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        text.add(index, textPerPart);
                        index++;
                        beginIndex += countSymbolsPerPart;
                    }
                    String lastParts = textDivide.substring(beginIndex, textDivide.length());
                    text.add(index, lastParts);
                }
            }
            command = scanner.nextLine();
        }
        for (String texts : text) {
            System.out.print(texts + " ");
        }
    }

}