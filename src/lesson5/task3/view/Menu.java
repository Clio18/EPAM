package lesson5.task3.view;

public class Menu {
    private String[] menu;

    public String[] getMenu() {
        return menu = new String[]{
                "Show all commands -------------------- enter 1",
                "Show dictionary -------------------- enter 2",
                "Put new word to the dictionary." + "\n" +
                        "Follow the quidelines" +
                        " -------------------- enter 3",
                "Get translation -------------------- enter 4",
                "Finish program -------------------- enter 0"};
    }
}
