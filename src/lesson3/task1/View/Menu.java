package lesson3.task1.View;

public class Menu {
    public String[] getMenu() {
        String[] menu;
        return menu = new String[]{
                "Show all commands - enter 1",
                "Show the list of toys - enter 2",
                "Get sorted list of toys by price - enter 3",
                "Get total sum of toys - enter 4",
                "Sorted toys by set of parameters: price and age - enter 5",
                "Sorted toys by set of parameters: price and age and type - enter 6",
                "Finish program - enter 0"};
        }
}
