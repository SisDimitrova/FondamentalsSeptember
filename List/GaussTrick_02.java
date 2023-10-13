package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        List<Integer> result = new ArrayList<>();

        if (numbers.size() % 2 != 0) {
            int middleIdx = numbers.size() / 2;
            numbers.add(middleIdx, 0);
        }
        for (int i = 0; i < numbers.size() / 2; i++) {
            int leftElements = numbers.get(i);
            int rightElements = numbers.get(numbers.size() - i - 1);
            result.add(leftElements + rightElements);
        }
        System.out.println(String.join(" ", result
                .stream()
                .map(e -> String.valueOf(e))
                .toArray(String[]::new)));
    }
}
