package FondamentalsOneExercises;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLostGame = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int countHeadset = 0;
        int countMouse = 0;
        int countKeyboard = 0;
        int countDisplay = 0;

        for (int i = 1; i <= countLostGame ; i++) {
            if (i % 2 == 0) {
                countHeadset++;
            }
            if (i % 3 == 0) {
                countMouse++;
            }
            if (i % 6 == 0) {
                countKeyboard++;
            }
            if (i % 12 == 0) {
                countDisplay++;
            }
        }
            double totalSum = (countHeadset * priceHeadset) + (countMouse * priceMouse) + (countDisplay * priceDisplay) + (countKeyboard * priceKeyboard);
            System.out.printf("Rage expenses: %.2f lv.", totalSum);
        }


    }

