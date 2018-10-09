package lesson2.task1.controller;
import lesson2.task1.data.Source;
import lesson2.task1.model.Books;
import lesson2.task1.model.entity.Book;
import lesson2.task1.view.BookView;
import java.util.Scanner;

public class Controller {
    private Books model = new Books();
    private BookView view = new BookView();


    public void run(int number) {
        model.setBooks(Source.getBook());
        switch (number) {
            case 2:
                view.printBook("All books: ", model.getBooks());
                System.out.println();
                break;
            case 3:
                searchByAuthor();
                break;
        }

    }

    private void searchByAuthor() {
        System.out.println("Enter the name of author: ");
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        Book[] result = model.getByAuthor(author);
        if (result.length == 0) {
            view.printMessage("No books by " + author);
        } else {
            view.printBook("Author - " + author, result);
        }
    }

}
