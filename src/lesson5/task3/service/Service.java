package lesson5.task3.service;

import lesson5.task3.model.Vocabulary;
import lesson5.task3.view.View;


import java.util.Set;

public class Service {
    Vocabulary vocabulary;
    View view = new View();

    public Service(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String translation(String expression) {
        String[] expressionToArray = expression.split("\\s");
        String result = "";
        Set<String> listOfKeys = vocabulary.getDictionary().keySet();
        for (String word : expressionToArray) {
            if (listOfKeys.contains(word)) {
                result = result + vocabulary.getDictionary().get(word) + " ";
            } else result = result + word + " ";
        }
        return result;
    }

    public void putNewPair(String newPair) {
        String [] chek = newPair.split("\\s");
        if (newPair!= null&&!chek[0].equals("null")&&!chek[1].equals("null")) {
            String[] pair = newPair.split("\\s");
            vocabulary.getDictionary().put(pair[0], pair[1]);
        } else view.printMessage(view.WRONG_INPUT);
    }
}
