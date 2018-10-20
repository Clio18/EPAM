package lesson2.task2.view;

import lesson2.task2.model.shape.Shape;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class View implements UserInfo {

    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);


    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void printSorted(Shape[] shapes, Comparator comparator) {
        Arrays.sort(shapes, comparator);
        printShapes(shapes);
    }

    public void getListOfCommands() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndResult(String message, double value) {
        if (value == 0) {
            System.out.println(View.WRONG_SHAPE);
        }
        System.out.println(message + value);
    }

    public int inputValue() {
        return scanner.nextInt();
    }

    public String inputName() {
        return scanner.nextLine();
    }
}
