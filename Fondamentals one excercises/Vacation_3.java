package FondamentalsOneExercises;

import java.util.Scanner;

public class Vacation_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double sum = 0.0;

        switch (typeGroup){
            case "Students":
                if (day.equals("Friday")){
                    sum = 8.45;
                } else if (day.equals("Saturday")) {
                    sum = 9.8;
                } else if (day.equals("Sunday")) {
                    sum = 10.46;
                }
                if (countPeople >= 30) {
                    sum -= sum * 0.15;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    sum = 10.9;
                } else if (day.equals("Saturday")) {
                    sum = 15.6;
                } else if (day.equals("Sunday")) {
                    sum = 16;
                }
                if (countPeople >= 100) {
                    countPeople -= 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    sum = 15;
                } else if (day.equals("Saturday")) {
                    sum = 20;
                } else if (day.equals("Sunday")) {
                    sum = 22.5;
                }
                if (countPeople >= 10 && countPeople <= 20) {
                    sum -= sum * 0.05;
                }
                break;
        }
        double totalSum = sum * countPeople;
        System.out.printf("Total price: %.2f", totalSum);
    }
}
