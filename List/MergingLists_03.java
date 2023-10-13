package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstSeq = scanner.nextLine().split(" ");
        String[] secondSeq = scanner.nextLine().split(" ");

        List<String> result = new ArrayList<>();

        int firstSeqIndex = 0;
        int secondSeqIndex = 0;
        boolean isFirstSeqTurn = true;

        while (firstSeqIndex >= 0 && firstSeqIndex < firstSeq.length &&
        secondSeqIndex >= 0 && secondSeqIndex < secondSeq.length){
           if (isFirstSeqTurn) {
               result.add(firstSeq[firstSeqIndex]);
               firstSeqIndex += 1;
               isFirstSeqTurn = false;
           } else {
               result.add(secondSeq[secondSeqIndex]);
               secondSeqIndex += 1;
               isFirstSeqTurn = true;
           }
        }
        for (int i = firstSeqIndex; i < firstSeq.length; i++) {
            result.add(firstSeq[i]);
        }
        for (int i = secondSeqIndex; i < secondSeq.length; i++) {
            result.add(secondSeq[i]);
        }
        System.out.println(String.join(" ",
                result.stream().map(e -> String.valueOf(e))
                        .toArray(String[]::new)));
    }
}
