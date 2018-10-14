package lesson2.task2.Main;

import lesson2.task2.Controller.Controller;
import lesson2.task2.view.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new View().getListOfCommands();
        System.out.println("Enter the command: ");
        int command = 0 ;
        while (command!=-1) {
            command = scanner.nextInt();
            new Controller().run(command);
        }
    }
}
