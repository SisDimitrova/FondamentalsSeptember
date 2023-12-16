package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BattleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> nameHealth = new LinkedHashMap<>();
        Map<String, Integer> nameEnergy = new LinkedHashMap<>();

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Results")) {
                break;
            }
            String[] commandArg = command.split(":");
            String commandName = commandArg[0];
            switch (commandName) {
                case "Add":
                    String name = commandArg[1];
                    int health = Integer.parseInt(commandArg[2]);
                    int energy = Integer.parseInt(commandArg[3]);
                    if (!nameHealth.containsKey(name)) {
                        nameHealth.put(name, health);
                        nameEnergy.put(name, energy);
                    } else {
                        nameHealth.put(name, nameHealth.get(name) + health);
                    }
                    break;
                case "Attack":
                    String attackerName = commandArg[1];
                    String defenderName = commandArg[2];
                    int damage = Integer.parseInt(commandArg[3]);
                    if (nameHealth.containsKey(attackerName) && nameHealth.containsKey(defenderName)) {
                        nameHealth.put(defenderName, nameHealth.get(defenderName) - damage);
                        nameEnergy.put(attackerName, nameEnergy.get(attackerName) - 1);
                        if (nameHealth.get(defenderName) <= 0) {
                            System.out.printf("%s was disqualified!%n", defenderName);
                            nameHealth.remove(defenderName);
                            nameEnergy.remove(defenderName);
                        }
                         if (nameEnergy.get(attackerName) <= 0) {
                            System.out.printf("%s was disqualified!%n", attackerName);
                            nameEnergy.remove(attackerName);
                            nameHealth.remove(attackerName);
                        }

                    }
                    break;
                case "Delete":
                    String userName = commandArg[1];
                    if (nameHealth.containsKey(userName)) {
                        nameHealth.remove(userName);
                        nameEnergy.remove(userName);
                    } else if (userName.equals("All")) {
                        nameHealth.clear();
                        nameEnergy.clear();
                    }
                    break;
            }
        }
        System.out.printf("People count: %d%n", nameHealth.size());
        nameHealth.entrySet().forEach(kvp -> {
            String name = kvp.getKey();
            int energy = nameEnergy.get(name);
            System.out.printf("%s - %d - %d%n", kvp.getKey(), kvp.getValue(), energy);

        });

    }
}
