package lesson3.task1.Controller;

import lesson3.task1.Model.ActionRoom;
import lesson3.task1.Source.SourceOfToys;
import lesson3.task1.View.View;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Controller {
    private ActionRoom actionRoom = new ActionRoom();
    private View view = new View();

    public void run(int number) {
        actionRoom.setListOfToys(SourceOfToys.getToy());
        switch (number) {
            case 0:
                view.getListOfCommands();
            case 1:
                view.showAllToys(actionRoom.getListOfToys());
                break;
            case 2:
                view.showAllToys(actionRoom.getSortedByPrice());
                break;
            case 3:
                actionRoom.totalPrice();
                break;
            case 4:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the max price: ");
                double price = scanner.nextDouble();
                System.out.println("Enter the age of the child: ");
                int age = scanner.nextInt();
                view.showAllToys(actionRoom.getToyByPriceAndAgeFrom(price, age));
                break;
        }

    }

}
