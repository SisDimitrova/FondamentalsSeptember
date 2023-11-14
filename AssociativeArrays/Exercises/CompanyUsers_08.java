package AssociativeArraysExercises;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> companyData = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String companyName = input.split(" -> ")[0];
            String ID = input.split(" -> ")[1];

            if (!companyData.containsKey(companyName)) {
                companyData.put(companyName, new ArrayList<>());
                companyData.get(companyName).add(ID);

            } else {
                List<String> currentID = companyData.get(companyName);
                if (!currentID.contains(ID)) {
                    companyData.get(companyName).add(ID);
                }
            }

        }
        companyData.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(id -> System.out.println("-- " + id));
        });
    }
}