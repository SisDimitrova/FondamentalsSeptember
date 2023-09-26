package FondamentalsOneExercises;

import java.util.Scanner;

public class PrintAndSum_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startNum; i <= lastNum ; i++) {
            System.out.print( i + " " );
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
