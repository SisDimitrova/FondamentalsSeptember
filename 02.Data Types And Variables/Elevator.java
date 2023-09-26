package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacitance = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(countPeople * 1.0 / capacitance);
        System.out.printf("%.0f", courses);
    }
}
