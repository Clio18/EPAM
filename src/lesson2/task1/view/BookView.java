package lesson2.task1.view;
import lesson2.task1.comparator.BookPublisherComparator;
import lesson2.task1.model.entity.Book;

import java.util.Arrays;

public class BookView {
    public void printBook(String message, Book[] books) {
        System.out.println(message);
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public void printMessage(String string){
        System.out.println(string);
    }

    public void printSortedBook(String message, Book[] books) {
        System.out.println(message);
        Arrays.sort(books, new BookPublisherComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
