package MyWorkFinishExam;

import java.util.Scanner;

public class WorldTour_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Travel")) {
                break;
            }
            String[] commandArg = line.split(":");
            String command = commandArg[0];
            switch (command){
                case "Add Stop":
                    int idx = Integer.parseInt(commandArg[1]);
                    String destination = commandArg[2];
                    String firstArg = input.substring(0, idx);
                    String secondArg = input.substring(idx);
                    input = firstArg.concat(destination).concat(secondArg);
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIdx = Integer.parseInt(commandArg[1]);
                    int endIdx = Integer.parseInt(commandArg[2]) + 1;
                    if (endIdx > input.length()) {
                        System.out.println(input);
                    } else {
                        input = input.substring(0, startIdx) + input.substring(endIdx);
                        System.out.println(input);
                    }
                    break;
                case "Switch":
                    String oldString = commandArg[1];
                    String newString = commandArg[2];
                    if (input.contains(oldString)) {
                        input = input.replace(oldString, newString);
                        System.out.println(input);
                    } else {
                        System.out.println(input);
                    }
                    break;
            }
        }
        System.out.println("Ready for world tour! Planned stops: " + input);
    }
}
