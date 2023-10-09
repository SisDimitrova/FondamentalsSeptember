package MethodsExercises;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNumber(n);
    }
    public static void printNumber (int num) {
        for (int row = 1; row <= num ; row++) {
            for (int col = 1; col <= num ; col++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
