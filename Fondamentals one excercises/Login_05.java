package FondamentalsOneExercises;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";


        for (int position = username.length() - 1 ; position >= 0  ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
        }
        int countWrongPassword = 0;
        String enterdPassword = scanner.nextLine();
        while (!enterdPassword.equals(password)) {
            countWrongPassword++;
            if (countWrongPassword == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");



            enterdPassword = scanner.nextLine();
        }

        System.out.printf("User %s logged in.", username);
        
    }
}
