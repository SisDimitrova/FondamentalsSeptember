package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        for (int index = 0; index < numbers.length -1; index++) {
            int currentNum = numbers[index];

            boolean isBiger = true;

            for (int i = index + 1; i <= numbers.length - 1 ; i++) {
                int afterNum = numbers[i];
                if (currentNum <= afterNum) {
                    isBiger = false;
                    break;
                }
            }
            if (isBiger) {
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbers[numbers.length -1]);
    }
}
