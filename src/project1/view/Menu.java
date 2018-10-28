package project1.view;

public class Menu {
    private String[] menu;

    public String[] getMenu() {
        return menu = new String[]{
                "Show all commands - enter 1",
                "Add goods to the track - enter 2",
                "Sort coffee by price/weight - enter 3",
                "Finish program - enter 0"};
    }
}
