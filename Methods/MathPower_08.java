package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double numPower = Double.parseDouble(scanner.nextLine());

        double result = powerMath(num,numPower);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));

    }
    public static double powerMath(double num,double power){
        double result = 1;
        for (int i = 1; i <= power ; i++) {
           result *= num;
        }
        return result;
    }
}
