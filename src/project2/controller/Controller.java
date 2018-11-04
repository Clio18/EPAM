package project2.controller;


import project2.model.Word;
import project2.repository.Source;
import project2.service.Service;
import project2.view.View1;

import java.util.List;

public class Controller {
    private Service service = new Service();
    private Source source = new Source();
    private View1 view = new View1();

    public void run() {
        String text = source.readFromFile("C:\\Users\\Clio\\IdeaProjects\\epam\\src\\project2\\Source.txt");
        view.printMessage(View1.MESSAGE_TO_INPUT);
        List<Word> words = service.sortBySymbol(text, view.readSymbol());
        view.print(words);
    }
}
