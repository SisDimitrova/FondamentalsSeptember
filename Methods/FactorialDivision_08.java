package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long factFirstNum = factorialNumber(firstNum);

        long factSecondNum = factorialNumber(secondNum);

        double result = factFirstNum * 1.0 / factSecondNum;
        System.out.printf("%.2f", result);


    }
    public static long factorialNumber (int num) {
        long fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact *= i;


        }
        return fact;
    }
}
