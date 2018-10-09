package lesson1.task2.Task2MVC;

import java.util.Scanner;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);

    public static int inputIntValueWithScanner(PerfectNumberView perfectNumberView) {
        perfectNumberView.printMessage(perfectNumberView.INPUT);
        while (!sc.hasNextInt()) {
            perfectNumberView.printMessage(perfectNumberView.WRONG_INPUT + perfectNumberView.INPUT);
            sc.next();
        }

        return sc.nextInt();
    }
}
