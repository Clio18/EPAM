package lesson10.main.java.com.epam.task61.controller.command;

public class ShowBooksCommand extends Command {
    @Override
    public String execute() {
        view.printMessage(manager.getMessage("listBooks"));
        return serviceBooks.showAllBooks();
    }
}
