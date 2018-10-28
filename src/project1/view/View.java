package project1.view;

import java.util.ArrayList;
import java.util.Scanner;

public class View<T> implements UserInfo{
    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);

    public void printList(ArrayList<T> list){
        for (T t: list){
            System.out.println(t);
        }
    }
    public void getListOfCommands() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
    public int inputValue() {
        return scanner.nextInt();
    }
}
