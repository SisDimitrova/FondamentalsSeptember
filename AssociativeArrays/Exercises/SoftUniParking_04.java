package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingValidation = new LinkedHashMap<>();

        for (int i = 1; i <= countCommands ; i++) {
            String command = scanner.nextLine();
            String nameCommand = command.split(" ")[0];
            String username = command.split(" ")[1];


            if (nameCommand.equals("register")) {
                String licenceNumber = command.split(" ")[2];
                if (parkingValidation.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingValidation.get(username));
                } else {
                    parkingValidation.put(username, licenceNumber);
                    System.out.printf("%s registered %s successfully%n",username, licenceNumber);
                }
            } else if (nameCommand.equals("unregister")) {
              if (!parkingValidation.containsKey(username)) {
                  System.out.printf("ERROR: user %s not found%n", username);
              } else {
                  parkingValidation.remove(username);
                  System.out.printf("%s unregistered successfully%n", username);
              }
            }
        }
        for (Map.Entry<String, String> entry : parkingValidation.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
