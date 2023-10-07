package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());

        String resultText = repeatString(countRepeat,text);

        System.out.println(resultText);

    }
    public static String repeatString(int countRepeat, String textRepeat) {
        String result = "";
        for (int i = 0; i < countRepeat; i++) {
            result += textRepeat;
        }
        return result;
    }
}
