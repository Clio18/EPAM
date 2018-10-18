package lesson2.task2.view;

import lesson2.task2.Comparator.ColorShapeComparator;
import lesson2.task2.Comparator.MaxSquareComparator;
import lesson2.task2.model.shape.Shape;

import java.util.Arrays;

public class View {
    public static final String MAIN_COMMAND = "Enter the command: ";
    public static final String INPUT_SHAPE = "Enter the name of the shape: ";
    public static final String SUM_OF_SHAPES = "Total sum of all shapes is:  ";
    public static final String SQUARE_SHAPE = "The sum of squares of chosen shapes: ";
    public static final String NOT_VALID = "Inexistent command!Choose command from the list!";
    private Menu menu = new Menu();

    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void printSortedListOfShapesBySquare(Shape[] shapes) {
        Arrays.sort(shapes, new MaxSquareComparator());
        printShapes(shapes);
    }

    public void printSortedListOfShapesByColor(Shape[] shapes) {
        Arrays.sort(shapes, new ColorShapeComparator());
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
        System.out.println(message + value);
    }
}
