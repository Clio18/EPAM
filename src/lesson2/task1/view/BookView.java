package lesson2.task1.view;
import lesson2.task1.model.entity.Book;

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

}
