package lesson2.task1.view;

public class View {
    public void getListOfCommands() {
        String [] listOfCommands = new String[]{
                "Show all commands - enter 0",
                "Show all books - enter 1",
                "Show all books by chosen author - enter 2",
                "Show all books by publisher - enter 3",
                "Show all books from chosen year - enter 4",
                "Show sorted list of books by publisher - enter 5",
                "Finish program - enter -1"
        };
        for (String command:listOfCommands){
            System.out.println(command);
        }
    }
}
