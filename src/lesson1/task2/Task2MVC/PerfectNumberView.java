package lesson1.task2.Task2MVC;

public class PerfectNumberView {
    public static final String INPUT = "Enter an integer = ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String OUTPUT = "Your perfect numbers are: ";

    public void printMessage(String message) {
        System.out.print(message);
    }
    public void printMessageAndResult(String message, String result) {
        System.out.println(message + result);
    }
}
