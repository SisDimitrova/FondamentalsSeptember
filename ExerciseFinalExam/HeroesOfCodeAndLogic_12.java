package MyWorkFinishExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogic_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String heroInfo = scanner.nextLine();
            String[] heroData = heroInfo.split(" ");
            String heroName = heroData[0];
            int hp = Integer.parseInt(heroData[1]);
            int mp = Integer.parseInt(heroData[2]);
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }

        }
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }
            String[] commandArg = command.split("\\s+-\\s+");
            String commandName = commandArg[0];
            String heroName = commandArg[1];

            switch (commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandArg[2]);
                    String spellName = commandArg[3];
                    int currentMP = heroesMP.get(heroName);
                    if (currentMP >= mpNeeded) {
                        int leftMP = currentMP - mpNeeded;
                        heroesMP.put(heroName, leftMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandArg[2]);
                    String attacker = commandArg[3];

                    int currentHp = heroesHP.get(heroName);
                    currentHp -= damage;

                    if (currentHp > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHp);
                        heroesHP.put(heroName, currentHp);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(commandArg[2]);
                    int currentMp = heroesMP.get(heroName);
                    currentMp += amount;
                    if (currentMp > 200) {
                        currentMp = 200;
                    }
                    System.out.printf("%s recharged for %d MP!%n", heroName, currentMp - heroesMP.get(heroName));
                    heroesMP.put(heroName, currentMp);
                    break;
                case "Heal":
                    int amountRecovered = Integer.parseInt(commandArg[2]);
                    int currentHP = heroesHP.get(heroName);
                    currentHP += amountRecovered;
                    if (currentHP > 100) {
                        currentHP = 100;
                    }
                    System.out.printf("%s healed for %d HP!%n", heroName, currentHP - heroesHP.get(heroName));
                    heroesHP.put(heroName, currentHP);
                    break;
            }
        }
        heroesHP.entrySet().forEach(entry -> {
            String heroName = entry.getKey();
            System.out.println(heroName);
            System.out.println("HP: " + entry.getValue());
            System.out.println("MP: " + heroesMP.get(heroName));
        });

    }
}