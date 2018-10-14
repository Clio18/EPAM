package lesson3.task1.View;

import lesson3.task1.Model.Toy.Toy;

public class View {
    public void showAllToys(Toy[] toys) {
        for (Toy t : toys) {
            System.out.println(t.toString());
        }
    }

    public void getListOfCommands() {
        String[] listOfCommands = new String[]{
                "Show all commands - enter 0",
                "Show the list of toys - enter 1",
                "Get sorted list of toys by price - enter 2",
                "Get total sum of toys - enter 3",
                "Sorted toys by set of parameters - enter 4",
                "Finish program - enter -1"
        };
        for (String command : listOfCommands) {
            System.out.println(command);
        }
    }
}
