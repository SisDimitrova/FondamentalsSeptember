package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")){
                int index1 =Integer.parseInt( command.split(" ") [1]);
                int index2 = Integer.parseInt(command.split(" ") [2]);

                int firstIndexNum = numbers[index1];
                int secondIndexNum = numbers[index2];

                numbers[index1] = secondIndexNum;
                numbers[index2] = firstIndexNum;

            } else if (command.contains("multiply")) {
                int index1 =Integer.parseInt( command.split(" ") [1]);
                int index2 = Integer.parseInt(command.split(" ") [2]);

                int firstIndexNum = numbers[index1];
                int secondIndexNum = numbers[index2];

                int product = firstIndexNum * secondIndexNum;
                numbers[index1] = product;

            } else if (command.equals("decrease")) {
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;

                }

            }


            command = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers).replace("[", "")
                .replace("]", ""));
    }
}
