package RegexExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);

            if(matcher.find()){
                String textPassword = matcher.group("passwordText");
                StringBuilder sbDigitalCategory = new StringBuilder();
                for (char symbol : textPassword.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        sbDigitalCategory.append(symbol);
                    }
                }
                if (sbDigitalCategory.length() == 0){
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + sbDigitalCategory);
                }
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
