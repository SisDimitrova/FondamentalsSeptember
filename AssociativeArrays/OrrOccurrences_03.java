package AssociativeArrays;

import java.util.*;

public class OrrOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : inputArr) {
            word = word.toLowerCase();

            wordMap.putIfAbsent(word, 0);
            wordMap.put(word, wordMap.get(word) + 1);
        }
        ArrayList<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}