package lesson1.task3.Task3MVC;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(PyramidView pyramidView) {
        pyramidView.printMessage(pyramidView.INPUT_INT_DATA);
        while( !sc.hasNextInt()) {
            pyramidView.printMessage(pyramidView.WRONG_INPUT_INT_DATA + pyramidView.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
