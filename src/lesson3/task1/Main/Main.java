package lesson3.task1.Main;

import lesson3.task1.Controller.Controller;
import lesson3.task1.View.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command = 0;
        new View().getListOfCommands();
        System.out.println("Enter the command: ");
        while (command!=-1) {
            command = scanner.nextInt();
            new Controller().run(command);
        }
    }
}
