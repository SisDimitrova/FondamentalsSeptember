package AssociativeArraysExercises;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int students = 1; students <= countStudent ; students++) {
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(nameStudent)) {
                studentGrades.put(nameStudent, new ArrayList<>());
                studentGrades.get(nameStudent).add(grade);
            } else {
                List<Double> currentGrade = studentGrades.get(nameStudent);
                currentGrade.add(grade);
            }
        }
        LinkedHashMap<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = getAverageGrade(grades);
            if (average >= 4.5) {
                studentAverageGrade.put(studentName, average);
            }
        }
        for (Map.Entry<String, Double> entry : studentAverageGrade.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
    private static double getAverageGrade(List<Double> grade) {
        double sum = 0;
        for (double grades : grade) {
            sum += grades;
        }
        return sum / grade.size();
    }
}
