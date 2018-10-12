package lesson2.task1.controller;

import lesson2.task1.data.Source;
import lesson2.task1.model.Books;
import lesson2.task1.model.entity.Book;
import lesson2.task1.view.BookView;
import lesson2.task1.view.View;

import java.util.Scanner;

public class Controller {
    private Books model = new Books();
    private BookView view = new BookView();
    private View viewOfCommand = new View();


    public void run(int number) {
        model.setBooks(Source.getBook());

        switch (number) {
            case 0:
                viewOfCommand.getListOfCommands();
                break;
            case 1:
                view.printBook("All books: ", model.getBooks());
                break;
            case 2:
                searchByAuthor();
                break;
            case 3:
                searchByPublisher();
                break;
            case 4:
                searchBooksFromYear();
            case 5:
                view.printSortedBook("Sorted books by publisher: ", model.getBooks());
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

    private void searchByPublisher() {
        System.out.println("Enter the publisher: ");
        Scanner scanner = new Scanner(System.in);
        String publisher = scanner.nextLine();
        Book[] result = model.getByPublisher(publisher);
        if (result.length == 0) {
            view.printMessage("No books by " + publisher);
        } else {
            view.printBook("Publisher - " + publisher, result);
        }
    }

    private void searchBooksFromYear() {
        System.out.println("Enter the year to start the search from: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int startYear = scanner.nextInt();
            Book[] result = model.getBooksFromYear(startYear);
            if (result.length == 0) {
                view.printMessage("No books by " + startYear);
            } else {
                view.printBook("All books from " + startYear, result);
            }
        }catch (Exception e){
            System.out.println("Not a number!Choose command from the list");
        }
    }



}
