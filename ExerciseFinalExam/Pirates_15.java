package MyWorkFinishExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cityPopulation = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Sail")) {
                break;
            }
            String[] input = line.split("\\|\\|");
            String city = input[0];
            int population = Integer.parseInt(input[1]);
            int gold = Integer.parseInt(input[2]);
            if (!cityPopulation.containsKey(city) && !cityGold.containsKey(city)) {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);

            } else {
                cityPopulation.put(city, cityPopulation.get(city) + population);
                cityGold.put(city, cityGold.get(city) + gold);
            }
        }
        while (true) {
            String events = scanner.nextLine();
            if (events.equals("End")) {
                break;
            }
            String[] eventsArg = events.split("=>");
            String command = eventsArg[0];
            String city = eventsArg[1];
            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(eventsArg[2]);
                    int gold = Integer.parseInt(eventsArg[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
                    cityPopulation.put(city, cityPopulation.get(city) - people);
                    cityGold.put(city, cityGold.get(city) - gold);
                    if (cityPopulation.get(city) <= 0 || cityGold.get(city) <= 0) {
                        cityPopulation.remove(city);
                        cityGold.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                    }
                    break;
                case "Prosper":
                    int addedGold = Integer.parseInt(eventsArg[2]);
                    if (addedGold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cityGold.put(city, cityGold.get(city) + addedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                addedGold, city, cityGold.get(city));
                    }
                    break;
            }
        }
        if (cityPopulation.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityPopulation.size());
            cityGold.entrySet().forEach(entry -> {
                String city = entry.getKey();
                int gold = entry.getValue();
                int population = cityPopulation.get(city);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", city, population, gold);
            });
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}