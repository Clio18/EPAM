package lesson2.task1.controller;

import lesson2.task1.data.Source;
import lesson2.task1.model.ModelBooks;
import lesson2.task1.model.entity.Book;
import lesson2.task1.view.BookView;
import lesson2.task1.view.Menu;


import java.util.Scanner;

public class Controller {
    private ModelBooks model = new ModelBooks();
    private BookView view = new BookView();


    public void run() {
        model.setModelBooks(Source.getBook());
        view.printMenu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number >= new Menu().getMenu().length || number < 0) {
                view.printMessage(view.NOT_VALID);
            } else
                switch (number) {
                    case 1:
                        view.printMenu();
                        break;
                    case 2:
                        view.printBook(model.getModelBooks());
                        break;
                    case 3:
                        view.printMessage(view.INPUT_AUTHOR);
                        scanner.nextLine();
                        view.printBook(model.getByAuthor(scanner.nextLine()));
                        break;
                    case 4:
                        view.printMessage(view.INPUT_PUBLISHER);
                        scanner.nextLine();
                        view.printBook(model.getByPublisher(scanner.nextLine()));
                        break;
                    case 5:
                        view.printMessage(view.INPUT_YEAR);
                        int year = scanner.nextInt();
                        if (model.getBooksFromYear(year).length == 0 || year < 0) {
                            view.printMessage(view.WARNING_YEAR + " " + year);
                        } else
                            view.printBook(model.getBooksFromYear(year));
                        break;
                    case 6:
                        view.printBook(model.getSortedBook(view.SORT_PUBLISHER));
                        break;
                    case 0:
                        return;
                }
        }

    }

}
