package lesson2.task2.Controller;

import lesson2.task2.Comparator.ColorShapeComparator;
import lesson2.task2.Comparator.MaxSquareComparator;
import lesson2.task2.service.Service;
import lesson2.task2.view.Menu;
import lesson2.task2.view.View;



public class Controller {

    private Service service = new Service();
    private View view = new View();

    public void run() {
        view.getListOfCommands();
        view.printMessage(view.MAIN_COMMAND);
        while (true) {
            int number = view.inputValue();
            if (number >= new Menu().getMenu().length || number < 0) {
                view.printMessage(view.NOT_VALID);
            } else
                switch (number) {
                    case 1:
                        view.getListOfCommands();
                        break;
                    case 2:
                        view.printShapes(service.getModel().getListOfShapes());
                        break;
                    case 3:
                        view.printMessageAndResult(view.SUM_OF_SHAPES, service.getSumSquare());
                        break;
                    case 4:
                        view.printMessage(view.INPUT_SHAPE);
                        view.inputName();
                        view.printMessageAndResult(view.SQUARE_SHAPE, service.getSumSquareOfDefiniteShape(view.inputName()));
                        break;
                    case 5:
                        view.printSorted(service.getModel().getListOfShapes(), new MaxSquareComparator());
                        break;
                    case 6:
                        view.printSorted(service.getModel().getListOfShapes(), new ColorShapeComparator());
                        break;
                    case 0:
                        return;
                }
        }
    }
}
