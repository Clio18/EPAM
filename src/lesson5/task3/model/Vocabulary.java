package lesson5.task3.model;
import lesson5.task3.source.Source;
import java.util.Map;

public class Vocabulary {
    private Map <String, String> dictionary;

   public Vocabulary() {
        setDictionary(Source.getMap());
    }

    public Map getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map dictionary) {
        this.dictionary = dictionary;
    }
}
