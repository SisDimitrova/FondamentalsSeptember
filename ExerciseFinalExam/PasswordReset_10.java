package MyWorkFinishExam;

import java.util.Scanner;

public class PasswordReset_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true) {
          String command = scanner.nextLine();
          if (command.equals("Done")) {
              break;
          }
          String[] commandArg = command.split(" ");
          String commandName = commandArg[0];
          switch (commandName){
              case "TakeOdd":
                  String updateInput = "";
                  for (int i = 1; i <= input.length() - 1; i += 2) {
                     updateInput += input.charAt(i);
                  }
                  input = updateInput;
                  System.out.println(input);
                  break;
              case "Cut":
                  int idx = Integer.parseInt(commandArg[1]);
                  int length = Integer.parseInt(commandArg[2]);
                  input = input.substring(0,idx) + input.substring(idx + length);
                  System.out.println(input);
                      break;
              case "Substitute":
                  String substring = commandArg[1];
                  String substitute = commandArg[2];
                  if (input.contains(substring)) {
                    input = input.replaceAll(substring, substitute);
                      System.out.println(input);
                  } else {
                      System.out.println("Nothing to replace!");
                  }
                  break;
          }
        }
        System.out.printf("Your password is: %s", input);
    }
}
