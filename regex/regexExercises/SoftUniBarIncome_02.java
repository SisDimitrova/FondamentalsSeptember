package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end of shift")) {
                break;
            }
            String regex = "%(?<customerName>[A-Z][a-z]+)%[^\\|\\$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>\\d+)\\|[^\\|\\$%\\.]*?(?<price>\\d+\\.?\\d*)\\$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customerName = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double priceOrder = count * price;
                totalPrice += priceOrder;
                System.out.printf("%s: %s - %.2f%n", customerName, product, priceOrder);
            }
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
