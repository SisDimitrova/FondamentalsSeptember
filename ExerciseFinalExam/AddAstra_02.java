package MyWorkFinishExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|\\|])(?<food>[A-Za-z ]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int sumCalories = 0;
        StringBuilder validFood = new StringBuilder();

        while (matcher.find()) {
            String food = matcher.group("food");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            sumCalories += calories;
            String outPut = String.format("Item: %s, Best before: %s, Nutrition: %d%n", food, expirationDate, calories);
            validFood.append(outPut);
        }
        System.out.printf("You have food to last you for: %d days!%n", sumCalories / 2000);
        System.out.println(validFood);
    }
}
