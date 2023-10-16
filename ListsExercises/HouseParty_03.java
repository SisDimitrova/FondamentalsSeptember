package ListsExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestsList = new ArrayList<>();

        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandsCount ; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String name = commandParts[0];
            if (command.contains("not")){
                if (guestsList.contains(name)){
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (guestsList.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            }
        }
        for (String nameGuest : guestsList) {
            System.out.println(nameGuest);
        }

    }
}
