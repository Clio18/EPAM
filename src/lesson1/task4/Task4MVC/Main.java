package lesson1.task4.Task4MVC;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);

        view.printArray(model.getArray());
        controller.rotateArrayToLeft();
        controller.rotateArrayToRight();

    }
}
