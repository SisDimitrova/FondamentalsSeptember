package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1 ; index++) {
            int currentNum = numbers[index];

            for (int i = index + 1; i <= numbers.length - 1; i++) {
              int nextNum = numbers[i];
              if (currentNum + nextNum == magicNum) {
                  System.out.println(currentNum + " " + nextNum);
              }
            }
        }


    }
}
