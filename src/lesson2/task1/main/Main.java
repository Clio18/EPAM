package lesson2.task1.main;
import lesson2.task1.controller.Controller;
import lesson2.task1.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int commandId = 0;
            new View().getListOfCommands();
            System.out.println("Enter id command: ");
            while (commandId != -1) {
                commandId = scanner.nextInt();
                if (commandId<-1){
                    System.out.println("Wrong command!Choose command from the list");
                } else
                new Controller().run(commandId);
            }
        } catch (Exception e){
            System.out.println("Wrong command");
        }
    }
}
