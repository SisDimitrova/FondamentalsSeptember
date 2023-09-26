package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0;
        String maxModel = "";

        for (int i = 1; i <= countKegs ; i++) {
            String modelKegs = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = modelKegs;
            }
        }
        System.out.println(maxModel);
    }
}
