package project1.controller;

import lesson3.task1.Comparator.PriceComparator;
import project1.comparator.PriceWeightComparator;
import project1.service.Service;
import project1.view.Menu;
import project1.view.View;

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
                        service.getFullTrack();
                        service.printStarBucksTrak();
                        break;
                    case 3:
                        service.printSorted(new PriceWeightComparator());
                        break;
                    case 0:
                        return;
                }
        }
    }
}
