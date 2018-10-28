package lesson5.task3.controller;

import lesson2.task2.view.Menu;
import lesson5.task3.model.Vocabulary;
import lesson5.task3.service.Service;
import lesson5.task3.view.View;

public class Controller {
    Vocabulary vocabulary = new Vocabulary();
    Service service = new Service(vocabulary);
    View view = new View();

    public void run() {
        view.printMessage(view.TITLE);
        view.getListOfCommands();
        view.printMessage(view.MAIN_COMMAND);
        while (true) {
            int numberOfCommand = view.inputValue();
            if (numberOfCommand >= new Menu().getMenu().length || numberOfCommand < 0) {
                view.printMessage(view.NOT_VALID_COMMAND);
            } else
                switch (numberOfCommand) {
                    case 1:
                        view.getListOfCommands();
                        view.printMessage(view.MAIN_COMMAND);
                        break;
                    case 2:
                        view.printDictionary(vocabulary.getDictionary());
                        break;
                    case 3:
                        view.printMessage(view.INPUT_PAIR);
                        service.putNewPair(view.generateNewPair());
                        view.printMessage(view.WELL_DONE);
                        break;
                    case 4:
                        view.printMessage(view.GET_TRANSLATION);
                        view.getPhraseForTranslation();
                        view.printMessage(service.translation(view.getPhraseForTranslation()));
                        break;
                    case 0:
                        return;
                }

        }
    }
}
