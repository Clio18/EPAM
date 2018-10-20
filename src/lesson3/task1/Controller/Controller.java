package lesson3.task1.Controller;

import lesson3.task1.Comparator.PriceComparator;
import lesson3.task1.Model.ActionRoom;
import lesson3.task1.Model.Toy.Toy;
import lesson3.task1.View.Menu;
import lesson3.task1.View.View;
import lesson3.task1.service.Service;


public class Controller<T extends Toy> {
    private ActionRoom actionRoom = new ActionRoom();
    private Service service = new Service(new ActionRoom());
    private View view = new View();

    public void run() {
        view.getListOfCommands();
        while (true) {
            int number = view.inputIntValue();
            if (number>=0&&number<new Menu().getMenu().length) {
                switch (number) {
                    case 1:
                        view.getListOfCommands();
                        break;
                    case 2:
                        view.showAllToys(actionRoom.getListOfToys());
                        break;
                    case 3:
                        view.showAllToys(service.getSortedByPrice(new PriceComparator()));
                        break;
                    case 4:
                        service.totalPrice();
                        break;
                    case 5:
                        view.printMessage(view.ENTER_MAX_PRICE);
                        double price = view.inputDoubleValue();
                        view.printMessage(view.ENTER_MAX_AGE);
                        int age = view.inputIntValue();
                        Toy[] result = service.getToyByPriceAndAgeFrom(price, age);
                        if (result.length > 0) {
                            view.showAllToys(result);
                        } else {
                            view.printMessage(view.ERROR);
                            return;
                        }
                        break;
                    case 6:
                        view.printMessage(view.ENTER_MAX_PRICE);
                        double price1 = view.inputDoubleValue();
                        view.printMessage(view.ENTER_MAX_AGE);
                        int age1 = view.inputIntValue();
                        view.printMessage(view.ENTER_TYPE);
                        String type1 = view.inputData();
                        Toy[] result1 = service.getToyByPriceAndAgeAndType(price1, age1, type1);
                        if (result1.length > 0) {
                            view.showAllToys(result1);
                        } else {
                            view.printMessage(view.ERROR);
                            return;
                        }
                        break;
                    case 0:
                        return;
                }
            }else break;
        }
    }

}
