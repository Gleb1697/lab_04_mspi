import java.util.Scanner;
import java.io.*;

public class WorkWithClient {
    private final Scanner keyboard;

    public WorkWithClient(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void startApp() {
        if (this.keyboard != null) {
            String clientInput;
            boolean exitFlag = true;
            System.out.println("Здравствуйте!");
            System.out.println("Для получения справки по командам программы введите \"help\"");
           do {
               clientInput = this.keyboard.nextLine();
               switch (clientInput) {
                   case "help":
                       Help.printHelp();
                       break;
                   /* 
                   case "shot":
                       Shot.newShot();
                       break;
                   */    
                   case "history":
                       History.showDots();
                       break;
                   case "exit":
                       exitFlag = Exit.changeExitFlag(exitFlag);
                       break;
                   default:
                        if (clientInput.matches("^shot\\s([-]?\\d+(\\.\\d+)?,\\s){2}(\\d+(\\.\\d+)?){1}$")) {
                            try {
                                Shot.newNewShot(clientInput);
                            }
                            catch (Exception e) {
                                System.out.println("Ошибка, попробуйте еще раз");
                            }
                        } else {
                            System.out.println("Ошибка в команде: " + clientInput + "\nПопробуйте еще раз.");
                        }
               }
           } while (exitFlag);
        }
    }
}