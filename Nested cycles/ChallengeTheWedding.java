package NestedCycles;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMans = Integer.parseInt(scanner.nextLine());
        int countWomen = Integer.parseInt(scanner.nextLine());
        int countTables = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int i = 1; i <= countMans ; i++) {
            for (int j = 1; j <= countWomen ; j++) {
                counter++;
                System.out.printf("(%d <-> %d) ", i, j );

                if (counter == countTables ) {
                    break;
                }
            }
            if (counter == countTables) {
                break;
            }
        }

    }
}
