package lesson1.task1.Task1MVC;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(InvertView view) {
        view.printMessage(view.INPUT_INT_DATA);
        while( !sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
