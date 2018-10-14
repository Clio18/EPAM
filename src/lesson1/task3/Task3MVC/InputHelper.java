package lesson1.task3.Task3MVC;

import java.util.Scanner;

public class InputHelper {
    private Scanner sc = new Scanner(System.in);

    public int inputIntValueWithScanner(PyramidView pyramidView) {
        pyramidView.printMessage(pyramidView.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            pyramidView.printMessage(pyramidView.WRONG_INPUT_INT_DATA + pyramidView.INPUT_INT_DATA);
            sc.next();
        }
        int number = sc.nextInt();
        int value = number;
        while (!(value > 0 && value < 10)) {
            System.out.println("Enter another number!");
            number = sc.nextInt();
            value = number;
        }
        return number;
    }

}


