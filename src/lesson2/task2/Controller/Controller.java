package lesson2.task2.Controller;

import lesson2.task2.model.Model;
import lesson2.task2.source.Source;
import lesson2.task2.view.Menu;
import lesson2.task2.view.View;

import java.util.Scanner;

public class Controller {
    private Model model = new Model();
    private View view = new View();

    public void run() {
        model.setListOfShapes(Source.getListOfShapes());
        view.getListOfCommands();
        Scanner scanner = new Scanner(System.in);
        view.printMessage(view.MAIN_COMMAND);
        while (true) {
            int number = scanner.nextInt();
            if (number >= new Menu().getMenu().length||number<0) {
                view.printMessage(view.NOT_VALID);
            } else
                switch (number) {
                    case 1:
                        view.getListOfCommands();
                        break;
                    case 2:
                        view.printShapes(model.getListOfShapes());
                        break;
                    case 3:
                        view.printMessageAndResult(view.SUM_OF_SHAPES, model.getSumSquare());
                        break;
                    case 4:
                        view.printMessage(view.INPUT_SHAPE);
                        scanner.nextLine();
                        view.printMessageAndResult(view.SQUARE_SHAPE, model.getSumSquareOfDefiniteShape(scanner.nextLine()));
                        break;
                    case 5:
                        view.printSortedListOfShapesBySquare(model.getListOfShapes());
                        break;
                    case 6:
                        view.printSortedListOfShapesByColor(model.getListOfShapes());
                        break;
                    case 0:
                        return;
                }
        }
    }
}
