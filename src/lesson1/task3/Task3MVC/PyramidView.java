package lesson1.task3.Task3MVC;

public class PyramidView {
    public static final String INPUT_INT_DATA = "Enter an integer = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "Result pyramid: ";
    public void printMessage(String message) {
        System.out.print(message);
    }
    public void printMessageAndResult(String message, int [][] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
