package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                  int numToAdd = Integer.parseInt(commandArr[1]);
                  numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(commandArr[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int insertIdx = Integer.parseInt(commandArr[2]);
                    numbers.add(insertIdx, numToInsert);
                    break;
            }



            input = scanner.nextLine();
        }
        System.out.println(String.join(" ",
                numbers.stream().map(e -> String.valueOf(e))
                        .toArray(String[]::new)));

    }
}
