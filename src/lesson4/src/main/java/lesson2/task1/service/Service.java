package lesson4.src.main.java.lesson2.task1.service;



import lesson4.src.main.java.lesson2.task1.model.Model;
import lesson4.src.main.java.lesson2.task1.model.entity.Book;

import java.util.Arrays;
import java.util.Comparator;

public class Service {
    private Model model;

    public Service(Model model) {
        this.model = model;
    }

    public lesson4.src.main.java.lesson2.task1.model.entity.Book[] getByAuthor(String author){
        Book[] temp = new Book[model.getModel().length];
        int count = 0;
        for (int i = 0; i < model.getModel().length; i++) {
            if(model.getModel()[i].getAuthor().equals(author)){
                temp[count++] = model.getModel()[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public lesson4.src.main.java.lesson2.task1.model.entity.Book[] getByPublisher(String publisher){
        Book [] temp = new Book[model.getModel().length];
        int count = 0;
        for (int i = 0; i < model.getModel().length; i++) {
            if(model.getModel()[i].getPublisher().equals(publisher)){
                temp[count++] = model.getModel()[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public lesson4.src.main.java.lesson2.task1.model.entity.Book[] getBooksFromYear(int year){
        Book [] temp = new Book[model.getModel().length];
        int count = 0;
        for (int i = 0; i < model.getModel().length; i++) {
            if(model.getModel()[i].getYear()>=year){
                temp[count++] = model.getModel()[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public lesson4.src.main.java.lesson2.task1.model.entity.Book[] getSortedBook(String message, Comparator comparator) {
        System.out.println(message);
        Arrays.sort(model.getModel(), comparator);
        return model.getModel();
    }

}
