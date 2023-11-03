package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] wordsArr = scanner.nextLine().split(" ");

        Random rnd = new Random();

        for (int i = 0; i < wordsArr.length; i++) {
            int rndIdx1 = rnd.nextInt(wordsArr.length);
            int rndIdx2 = rnd.nextInt(wordsArr.length);

            String oldWord = wordsArr[rndIdx1];
            wordsArr[rndIdx1] = wordsArr[rndIdx2];
            wordsArr[rndIdx2] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
