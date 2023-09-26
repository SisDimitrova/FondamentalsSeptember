package Exercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroups = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countNight = Integer.parseInt(scanner.nextLine());

        String practisingSport = "";
        double price = 0.0;

        if (typeGroups.equals("girls") && season.equals("Winter")) {
            practisingSport = "Gymnastics";
            price = 9.60;
        } else if (typeGroups.equals("girls") && season.equals("Spring")) {
            practisingSport = "Athletics";
            price = 7.2;
        } else if (typeGroups.equals("girls") && season.equals("Summer")) {
            practisingSport = "Volleyball";
            price = 15;
        } else if (typeGroups.equals("boys") && season.equals("Winter")) {
            practisingSport = "Judo";
            price = 9.60;
        } else if (typeGroups.equals("boys") && season.equals("Spring")) {
            practisingSport = "Tennis";
            price = 7.2;
        } else if (typeGroups.equals("boys") && season.equals("Summer")) {
            practisingSport = "Football";
            price = 15;
        }else if (typeGroups.equals("mixed") && season.equals("Winter")) {
            practisingSport = "Ski";
            price = 10;
        } else if (typeGroups.equals("mixed") && season.equals("Spring")) {
            practisingSport = "Cycling";
            price = 9.5;
        } else if (typeGroups.equals("mixed") && season.equals("Summer")) {
            practisingSport = "Swimming";
            price = 20;
        }
        double totalSum = price * countNight * countStudents;
        if (countStudents > 50) {
            totalSum = totalSum / 2;
        } else if (countStudents >= 20 && countStudents < 50) {
            totalSum -= totalSum * 0.15;
        } else if (countStudents >= 10 && countStudents < 20) {
            totalSum -= totalSum * 0.05;
        }
        System.out.printf("%s %.2f lv.", practisingSport, totalSum);
    }
}
