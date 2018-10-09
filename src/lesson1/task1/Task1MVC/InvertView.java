package lesson1.task1.Task1MVC;

public class InvertView {
    public static final String INPUT_INT_DATA =  "Enter an integer = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "Inversion result: ";
    public void printMessage(String message) {
        System.out.print(message);
    }
    public void printMessageAndResult(String message, String result) {
        System.out.println(message + result);
    }

}
