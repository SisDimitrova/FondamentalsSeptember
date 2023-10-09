package MethodsExercises;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 8; i <= n ; i++) {
            boolean isValidSumDigits = checkSumDigitsIsDivisibleBy8(i);
            if (isValidSumDigits) {
                boolean isContainsOddDigits = checkContainsOddDigits(i);
                if (isContainsOddDigits) {
                    System.out.println(i);
                }
            }
        }
    }
    public static boolean checkSumDigitsIsDivisibleBy8 (int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;
        }
        return sum % 8 == 0;
    }
    public static boolean checkContainsOddDigits (int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}
