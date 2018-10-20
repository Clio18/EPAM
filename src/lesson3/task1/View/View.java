package lesson3.task1.View;

import lesson3.task1.Model.Toy.Toy;


import java.util.Scanner;

public class View implements UserInfo {
    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);

    public void showAllToys(Toy[] toys) {
        for (Toy t : toys) {
            System.out.println(t);
        }
    }

    public void getListOfCommands() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int inputIntValue() {
        int number = -1;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        return number;
    }

    public double inputDoubleValue() {
        double number = -1;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        }
        return number;
    }

    public String inputData() {
        String value = null;
        if (scanner.hasNext()) {
            value = scanner.next();
        }
        return value;
    }


}
