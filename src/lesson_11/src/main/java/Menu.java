package lesson_11.src.main.java;

public class Menu {
    private String[] menu;

    public String[] getMenu() {
        return menu = new String[]{
                "Show all commands - enter 1",
                "GetAllStuff- enter 2",
                "GetAllTask - enter 3",
                "GetStuffFromDepartment - enter 4",
                "AddTaskToStuff - enter 5",
                "GetTasksFromStuff - enter 6",
                "Finish program - enter 0"};
    }
}
