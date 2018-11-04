package project2.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Word {
    private List<Symbol> symbols;

    public Word(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public int compareWithSymbol(Word w2, Symbol symbol) {
        Integer f1 = Collections.frequency(symbols, symbol);
        Integer f2 = Collections.frequency(w2.getSymbols(), symbol);//frequency use method 'equals' to compare objects
        int result = - f1.compareTo(f2);
        if (result == 0) {
            return getString().compareTo(w2.getString());
        }
        return result;
    }

    public String getString() {
        return symbols.stream()
                      .map(String::valueOf)
                      .collect(Collectors.joining());
    }

    @Override
    public String toString() {
        return getString();
    }
}
