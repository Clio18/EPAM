package lesson2.task2.Controller;

import lesson2.task2.model.Model;
import lesson2.task2.source.Source;
import lesson2.task2.view.View;

import java.util.Scanner;

public class Controller {
    private Model model = new Model();
    private View view = new View();


    public void run(int number) {
        model.setListOfShapes(Source.getListOfShapes());
        switch (number) {
            case 0:
                view.getListOfCommands();
                break;
            case 1:
                view.printShapes(model.getListOfShapes());
                break;
            case 2:
                System.out.println(model.getSumSquare());
                break;
            case 3:
                System.out.println("Enter the name of the shape: ");
                Scanner scanner = new Scanner(System.in);
                System.out.println(model.getSumSquareOfDefiniteShape(scanner.nextLine()));
                break;
            case 4:
                view.printSortedListOfShapesBySquare(model.getListOfShapes());
                break;
            case 5:
                view.printSortedListOfShapesByColor(model.getListOfShapes());
                break;
        }

    }
}
