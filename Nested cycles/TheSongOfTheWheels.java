package NestedCycles;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isValid = false;
        String lastPassword = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i < j && k > l) && (i * j + k * l) == controlValue) {
                            count++;
                            if (count == 4) {
                                lastPassword = String.format("%d%d%d%d" , i, j, k, l);
                                isValid = true;
                            }
                            System.out.printf("%d%d%d%d ",  i, j, k, l);
                        }
                    }
                }
            }
        }
        System.out.println();
        if (isValid) {
            System.out.printf("Password: %s", lastPassword);
        } else {
            System.out.println("No!");
        }
    }
}