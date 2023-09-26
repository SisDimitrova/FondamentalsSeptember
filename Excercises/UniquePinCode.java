package Exercises;

import java.util.Scanner;

public class UniquePinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=firstNum ; i++) {
            for (int j = 1; j <=secondNum ; j++) {
                for (int k = 1; k <=thirdNum ; k++) {
                    if (i % 2 == 0 && j >= 2 && j <= 7 && j!= 4 && j!= 6 && k % 2 == 0) {
                        System.out.println("" + i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
