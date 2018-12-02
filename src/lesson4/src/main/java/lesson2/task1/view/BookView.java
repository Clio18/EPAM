package lesson4.src.main.java.lesson2.task1.view;
import lesson4.src.main.java.lesson2.task1.model.entity.Book;
import java.util.Scanner;


public class BookView implements UserInfo {

    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printBook(Book[] books) {
        if (books.length == 0) {
            printMessage(BookView.NOT_VALID);
        } else
            for (Book book : books) {
                System.out.println(book);
            }
    }

    public void printMessage(String string) {
        System.out.println(string);
    }

    public String inputName() {
        return scanner.nextLine();
    }

    public int inputValue() {
        int number = -1;
        if(scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        return number;
    }

}
