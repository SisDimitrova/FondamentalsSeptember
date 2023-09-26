package FORCICLE;

import java.util.Scanner;

public class StudyHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wMatres = Double.parseDouble(scanner.nextLine());
        double hMatres = Double.parseDouble(scanner.nextLine());

        double wSm = wMatres * 100;
        double hSm = hMatres * 100;

        double smNoCorridor = hSm - 100;

        double countDesksInOrder = Math.floor(smNoCorridor / 70);
        double countPlaces = Math.floor(wSm / 120);

        double allPlaces = countPlaces * countDesksInOrder - 3;

        System.out.printf("%.0f", allPlaces);


    }
}
