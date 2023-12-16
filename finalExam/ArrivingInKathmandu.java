package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();


        String regex = "^(?<name>[A-Za-z0-9!@#$?]+)=(?<length>\\d+)<<(?<code>(.*?)+)$";
        Pattern pattern = Pattern.compile(regex);

        while (!line.equals("Last note")) {

            Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String name = matcher.group("name");
                int length = Integer.parseInt(matcher.group("length"));
                String code = matcher.group("code");

                if(length == code.length()){
                    StringBuilder sb = new StringBuilder();

                    for (int i = 0; i < name.length(); i++) {
                        char letter = name.charAt(i);
                        if (Character.isLetterOrDigit(letter)) {
                            sb.append(letter);
                        }
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s", sb, code));
                } else {
                    System.out.println("Nothing found!");
                }
            } else {
                System.out.println("Nothing found!");
            }

              line = scanner.nextLine();
        }
    }
}