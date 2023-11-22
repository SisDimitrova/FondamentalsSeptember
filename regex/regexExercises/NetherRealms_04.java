package RegexExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nameDemon = Arrays.stream(scanner.nextLine().replaceAll(" ", "").split(","))
                .collect(Collectors.toList());

        String regexHealth = "[^0-9+*-\\/.]";
        Pattern patternHealth = Pattern.compile(regexHealth);
        String regexDamage = "\\+?\\-?\\d+\\.?\\d*";
        Pattern patternDamage = Pattern.compile(regexDamage);

        for (String name : nameDemon) {
            Matcher matcherHealth = patternHealth.matcher(name);
            int health = 0;
            while (matcherHealth.find()) {
                char symbol = matcherHealth.group().charAt(0);
                health += symbol;
            }
            Matcher matcherDamage = patternDamage.matcher(name);
            double damage = 0;
            while (matcherDamage.find()) {
                double currentDamage = Double.parseDouble(matcherDamage.group());
                damage += currentDamage;
            }
            for (char symbol : name.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", name, health, damage);
        }
    }
}
