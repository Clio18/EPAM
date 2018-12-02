package lesson4.src.main.java.lesson2.task1.controller;


import lesson4.src.main.java.lesson2.task1.comparator.BookPublisherComparator;
import lesson4.src.main.java.lesson2.task1.data.Source;
import lesson4.src.main.java.lesson2.task1.model.Model;
import lesson4.src.main.java.lesson2.task1.service.Service;
import lesson4.src.main.java.lesson2.task1.view.BookView;

public class Controller {
    private Service service = new Service(new Model());
    private BookView view = new BookView();


    public void run() {
        view.printMenu();
        while (true) {
            int number = view.inputValue();
            if (number != -1 && number <= 6) switch (number) {
                case 1:
                    view.printMenu();
                    break;
                case 2:
                    view.printBook(Source.getBook());
                    break;
                case 3:
                    view.printMessage(BookView.INPUT_AUTHOR);
                    view.inputName();
                    view.printBook(service.getByAuthor(view.inputName()));
                    break;
                case 4:
                    view.printMessage(BookView.INPUT_PUBLISHER);
                    view.inputName();
                    view.printBook(service.getByPublisher(view.inputName()));
                    break;
                case 5:
                    view.printMessage(BookView.INPUT_YEAR);
                    int year = view.inputValue();
                    if (service.getBooksFromYear(year).length == 0 || year < 0) {
                        view.printMessage(BookView.WARNING_YEAR + " " + year);
                    } else view.printBook(service.getBooksFromYear(year));
                    break;
                case 6:
                    view.printBook(service.getSortedBook(BookView.SORT_PUBLISHER, new BookPublisherComparator()));
                    break;
                case 0:
                    return;
            }
            else {
                view.printMessage(BookView.NOT_VALID);
                break;
            }
        }

    }


}
