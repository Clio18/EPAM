package lesson4.src.main.java.lesson2.task1.view;

public class Menu {
    private String[] menu;

    public String[] getMenu() {
        return menu = new String[]{
                "Show all commands - enter 1",
                "Show all books - enter 2",
                "Show all books by chosen author - enter 3",
                "Show all books by publisher - enter 4",
                "Show all books from chosen year - enter 5",
                "Show sorted list of books by publisher - enter 6",
                "Finish program - enter 0"
        };

    }
}
