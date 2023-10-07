package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if (type.equals("int")) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum,secondNum));
        } else if (type.equals("char")) {
            char firstLetter = scanner.nextLine().charAt(0);
            char secondLetter = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstLetter,secondLetter));
        } else {
            String firstStr = scanner.nextLine();
            String secondStr = scanner.nextLine();
            System.out.println(getMax(firstStr,secondStr));
        }


    }
    public static int getMax (int a, int b) {
        if (a > b){
       return a;
        } else {
            return b;
        }

    }
    public static char getMax(char firstLetter,char secondLetter) {
        if (firstLetter > secondLetter) {
            return firstLetter;
        } else {
            return secondLetter;
        }

    }
    public static String getMax(String firstStr,String secondStr) {
        if (firstStr.compareTo(secondStr) >= 0) {
            return firstStr;
        } else {
            return secondStr;

            }
        }
    }



