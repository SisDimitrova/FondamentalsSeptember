package MyWorkFinishExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBarcode = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<barcode>[A-Z][A-Za-z\\d]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < countBarcode; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                StringBuilder sbDigitsCategory = new StringBuilder();
                for (char symbol : barcode.toCharArray()) {
                   if (Character.isDigit(symbol)) {
                       sbDigitsCategory.append(symbol);
                   }
                }
                if (sbDigitsCategory.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sbDigitsCategory);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
