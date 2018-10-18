package lesson2.task2.view;

public class Menu {
    private String[] menu;

    public String[] getMenu() {
        return menu = new String[]{
                "Show all commands - enter 1",
                "Show all shapes - enter 2",
                "Get sum of all shape's square - enter 3",
                "Get sum of chosen shape's square - enter 4",
                "Sorted shapes by square - enter 5",
                "Sorted shapes by color - enter 6",
                "Finish program - enter 0"};
    }
}
