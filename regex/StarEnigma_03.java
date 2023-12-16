package RegexExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> planetsAttack = new ArrayList<>();
        List<String> planetsDestroy = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int counter = 0;
            for (int j = 0; j < input.length(); j++) {
              char letterSymbol = input.charAt(j);
              if (letterSymbol == 's' || letterSymbol == 'S' || letterSymbol == 't' || letterSymbol == 'T'
              || letterSymbol == 'a' || letterSymbol == 'A' || letterSymbol == 'r' || letterSymbol == 'R') {
                  counter++;
              }
            }
            String decryption = "";
            for (int j = 0; j < input.length(); j++) {
                char decryptionSymbol = (char) (input.charAt(j) - counter);
                decryption += decryptionSymbol;

            }
            String regex ="@(?<namePlanet>[A-Z][a-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<countSoldiers>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryption);
            if (matcher.find()) {
                if (matcher.group("attack").equals("A")) {
                    planetsAttack.add(matcher.group("namePlanet"));
                } else if (matcher.group("attack").equals("D")) {
                    planetsDestroy.add(matcher.group("namePlanet"));
                }
            }
        }
        Collections.sort(planetsAttack);
        System.out.printf("Attacked planets: %d%n", planetsAttack.size());
        planetsAttack.forEach(name -> System.out.println("-> " + name));

        Collections.sort(planetsDestroy);
        System.out.printf("Destroyed planets: %d%n", planetsDestroy.size());
        planetsDestroy.forEach(name -> System.out.println("-> " + name));

    }
}
