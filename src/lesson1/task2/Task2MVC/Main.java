package lesson1.task2.Task2MVC;

public class Main {
    public static void main(String[] args) {
        PerfectNumberModel perfectNumberModel = new PerfectNumberModel();
        PerfectNumberView perfectNumberView = new PerfectNumberView();
        PerfectNumberController perfectNumberController = new PerfectNumberController(perfectNumberModel, perfectNumberView);
        perfectNumberController.calculate();
    }

}
