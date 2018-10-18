package lesson2.task1.view;

import lesson2.task1.model.entity.Book;


public class BookView {
    public static final String NOT_VALID = "This command does not valid. Please, choose the command from the list";
    public static final String INPUT_AUTHOR = "Enter the author: ";
    public static final String INPUT_PUBLISHER = "Enter the publisher: ";
    public static final String INPUT_YEAR = "Enter the year: ";
    public static final String WARNING_YEAR = "There are no books from such a year: ";
    public static final String SORT_PUBLISHER = "Sorted books by publisher: ";
    private Menu menu = new Menu();

    public void printMenu() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printBook(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printMessage(String string) {
        System.out.println(string);
    }

}
