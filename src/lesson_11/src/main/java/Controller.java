package lesson_11.src.main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    DAO dao = new UserDAO();

    public void run() {
        printList(Arrays.asList(new Menu().getMenu()));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number >= new Menu().getMenu().length || number < 0) {
                System.out.println("NOT_VALID");
            } else
                switch (number) {
                    case 1:
                        printList(Arrays.asList(new Menu().getMenu()));
                        break;
                    case 2:
                        printList(dao.getAllStuff());
                        break;
                    case 3:
                        printList(dao.getAllTask());
                        break;
                    case 4:
                        System.out.println("Enter the name of department");
                        String dep = scanner.next();
                        printList(dao.getStuffFromDepartment(dep)); //не корректно
                        break;
                    case 5:
                        System.out.println("Enter the id of stuf in XXX format");
                        int id = scanner.nextInt();
                        System.out.println("Enter the description of the task");
                        String desc = scanner.next();
                        dao.addTaskToStuff(id, desc); //не корректно
                        break;
                    case 6:
                        printList(dao.getTasksFromStuff(scanner.nextInt()));
                        break;
                    case 0:
                        return;
                }
        }
    }

    private static void printList(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
