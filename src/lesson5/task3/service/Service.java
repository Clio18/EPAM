package lesson5.task3.service;
import lesson5.task3.model.Vocabulary;


import java.util.Set;

public class Service {
    Vocabulary vocabulary;

    public Service(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String translation (String expression){
        String[]expressionToArray = expression.split("\\s");
        String result = "";
        Set<String> listOfKeys = vocabulary.getDictionary().keySet();
       for (String word:expressionToArray){
           if(listOfKeys.contains(word)){
               result = result + vocabulary.getDictionary().get(word) + " ";
           } else result = result + word + " ";
       }
        return result;
    }
}
