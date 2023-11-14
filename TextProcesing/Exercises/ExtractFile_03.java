package TextProcessingExercises;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");
        String fullName = path[path.length - 1];

        String name = fullName.split("\\.")[0];
        String extension = fullName.split("\\.")[1];

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);


    }
}
