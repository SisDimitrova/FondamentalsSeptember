package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] temp = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            temp[i] = number[i];
        }

        for (int i = 0; i < number.length - 1; i++) {
            int[] current = new int[temp.length - 1];
            for (int j = 0; j < current.length; j++) {
                current[j] = temp[j] + temp[j + 1];

            }
            temp = current;
        }
        System.out.println(temp[0]);

    }
}
