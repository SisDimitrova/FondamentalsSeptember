package ArraysExercises;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int rows = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[rows];
        int [] secondArray = new int[rows];

        for (int row = 1; row <= rows ; row++) {
            String input = scanner.nextLine();
            String [] numbers = input.split(" ");
            int num1 = Integer.parseInt(numbers [0]);
            int num2 = Integer.parseInt(numbers [1]);

            if (row % 2 == 0) {
                firstArray[row - 1] = num2;
                secondArray[row - 1] = num1;
            } else {
               firstArray[row - 1] = num1;
               secondArray[row -1] = num2;

            }
        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
