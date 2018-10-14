package lesson2.task2.view;

import lesson2.task2.Comparator.ColorShapeComparator;
import lesson2.task2.Comparator.MaxSquareComparator;
import lesson2.task2.model.shape.Shape;

import java.util.Arrays;

public class View {
    public void printShapes (Shape[] shapes){
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
    public void printSortedListOfShapesBySquare(Shape[] shapes){
        Arrays.sort(shapes, new MaxSquareComparator());
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
    public void printSortedListOfShapesByColor(Shape[] shapes){
        Arrays.sort(shapes, new ColorShapeComparator());
        for (Shape shape:shapes){
            System.out.println(shape);
        }
    }
    public void getListOfCommands() {
        String [] listOfCommands = new String[]{
                "Show all commands - enter 0",
                "Show all shapes - enter 1",
                "Get sum of all shape's square - enter 2",
                "Get sum of chosen shape's square - enter 3",
                "Sorted shapes by square - enter 4",
                "Sorted shapes by color - enter 5",
                "Finish program - enter -1"
        };
        for (String command:listOfCommands){
            System.out.println(command);
        }
    }
}
