package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<Character, Integer> countSymbol = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!countSymbol.containsKey(symbol)) {
                countSymbol.put(symbol, 1);
            } else {
                int currentCount = countSymbol.get(symbol);
                countSymbol.put(symbol, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countSymbol.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
