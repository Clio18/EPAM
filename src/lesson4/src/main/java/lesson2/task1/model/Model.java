package lesson4.src.main.java.lesson2.task1.model;


import lesson4.src.main.java.lesson2.task1.data.Source;
import lesson4.src.main.java.lesson2.task1.model.entity.Book;

public class Model {
    private Book[] books;

    public Model() {
        setModel(Source.getBook());
    }

    public Book[] getModel() {
        return books;
    }

    public void setModel(Book[] books) {
        this.books = books;
    }
}
