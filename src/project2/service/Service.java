package project2.service;


import project2.model.Symbol;
import project2.model.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Service {

    public List<Word> sortBySymbol(String text, Symbol symbol) {
        List<Word> listOfWords = getWords(text.toLowerCase());
        listOfWords.sort((w1, w2) -> w1.compareWithSymbol(w2, symbol));
        return listOfWords;
    }

    private List<Word> getWords(String text) {
        List<Word> listOfWords = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String stringWord = matcher.group();
            List<Symbol> symbols = extractSymbols(stringWord);
            listOfWords.add(new Word(symbols));
        }
        return listOfWords;
    }

    private List<Symbol> extractSymbols(String stringWord) {
        List<Symbol> symbols = new ArrayList<>();
        for (char c : stringWord.toCharArray()) {
            symbols.add(new Symbol(c));
        }
        return symbols;
    }
}
