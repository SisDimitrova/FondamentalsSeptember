package MyWorkFinishExam;

import java.util.Scanner;

public class ActivationKeys_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Generate")) {
                break;
            }
            String[] command = line.split(">>>");
            String commandName = command[0];
            switch (commandName) {
                case "Contains":
                    String substring = command[1];
                    if (input.contains(substring)) {
                        System.out.printf("%s contains %s%n", input, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = command[1];
                    int startIdx = Integer.parseInt(command[2]);
                    int endIdx = Integer.parseInt(command[3]);
                    String flipped = "";
                    if (upperOrLower.equals("Upper")) {
                        flipped = input.substring(startIdx, endIdx).toUpperCase();
                    } else {
                        flipped = input.substring(startIdx, endIdx).toLowerCase();
                    }
                    input = input.substring(0, startIdx) + flipped + input.substring(endIdx);
                    System.out.println(input);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    input = input.substring(0,startIndex) + input.substring(endIndex);
                    System.out.println(input);
                    break;
            }
        }
        System.out.printf("Your activation key is: %s", input);
    }
}
