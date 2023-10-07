package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operators = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculate( a, operators,b);
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println(df.format(result));
    }
    public static double calculate (int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
        }
        return result;
    }
}
