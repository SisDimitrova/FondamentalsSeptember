package MyWorkFinishExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> pieceByComposer = new LinkedHashMap<>();
        Map<String, String> pieceByKey = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];
            String composer = input[1];
            String key = input[2];
            pieceByComposer.put(piece, composer);
            pieceByKey.put(piece, key);

        }
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Stop")) {
                break;
            }
            String[] commandArg = line.split("\\|");
            String command = commandArg[0];

            switch (command) {
                case "Add":
                 String piece = commandArg[1];
                 String composer = commandArg[2];
                 String key = commandArg[3];
                 if (pieceByComposer.containsKey(piece)) {
                     System.out.printf("%s is already in the collection!%n", piece);
                 } else {
                     pieceByComposer.put(piece, composer);
                     pieceByKey.put(piece, key);
                     System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                 }
                    break;
                case "Remove":
                    String removePiece = commandArg[1];
                    if (pieceByComposer.containsKey(removePiece)) {
                        pieceByComposer.remove(removePiece);
                        pieceByKey.remove(removePiece);
                        System.out.printf("Successfully removed %s!%n", removePiece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                    }
                    break;
                case "ChangeKey":
                    String pieceChangeKey = commandArg[1];
                    String newKey = commandArg[2];
                    if (pieceByComposer.containsKey(pieceChangeKey)) {
                        pieceByKey.put(pieceChangeKey, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceChangeKey, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceChangeKey);
                    }
                    break;
            }
        }
        for (String piece : pieceByComposer.keySet()) {
            String compose = pieceByComposer.get(piece);
            String key = pieceByKey.get(piece);

            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, compose, key);
        }
    }
}
