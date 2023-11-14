package AssociativeArraysExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String,Integer> userPoints = new LinkedHashMap<>();
        LinkedHashMap<String,Integer> countLanguage = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] splitArray = input.split("-");
            String username = splitArray[0];
            if (splitArray.length == 3) {
                String language = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);

                if (!userPoints.containsKey(username)) {
                    userPoints.put(username, points);

                } else {
                    int currentPoints = userPoints.get(username);
                    if (points > currentPoints) {
                        userPoints.put(username, points);
                    }
                }
                if (!countLanguage.containsKey(language)) {
                    countLanguage.put(language, 1);
                } else {
                    countLanguage.put(language, countLanguage.get(language) + 1);
                }
            } else {
                userPoints.remove(username);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet()
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        countLanguage.entrySet()
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
