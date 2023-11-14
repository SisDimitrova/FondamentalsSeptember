package AssociativeArraysExercises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] command = input.split(" : ");
            String coursesName = command[0];
            String studentName = command[1];

            if (!courses.containsKey(coursesName)) {
                courses.put(coursesName, new ArrayList<>());
                courses.get(coursesName).add(studentName);
            } else {
                courses.get(coursesName).add(studentName);
            }

        }
        courses.entrySet().forEach(entry -> {
            int num = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), num);
            entry.getValue().forEach(student -> System.out.printf("-- %s%n", student));
        });
    }
}
