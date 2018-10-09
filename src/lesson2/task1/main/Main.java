package lesson2.task1.main;
import lesson2.task1.controller.Controller;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandId = 0;
        System.out.println("Enter id command: ");
        while (commandId!=-1) {
            commandId = scanner.nextInt();
            new Controller().run(commandId);
        }
    }
}
