package project2.view;

import project2.model.Symbol;
import project2.model.Word;

import java.util.List;
import java.util.Scanner;

public class View1 {
    public static final String MESSAGE_TO_INPUT = "Input one symbol and press Enter";
    Scanner scanner = new Scanner(System.in);
    public Symbol readSymbol() {
        return new Symbol(scanner.nextLine().charAt(0));
    }

    public void print(List<Word> words) {
        words.stream().forEach(word -> System.out.println(word.toString() + ", "));
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
