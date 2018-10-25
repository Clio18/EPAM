package lesson5.task3.controller;

import lesson5.task3.model.Vocabulary;
import lesson5.task3.service.Service;
import lesson5.task3.view.View;

public class Controller {
    Service service = new Service(new Vocabulary());
    View view = new View();
    public void run(){
        view.printTranslation(service.translation("red elephant"));
    }
}
