package lesson1.task3.Task3MVC;

public class Main {
    public static void main(String[] args) {
        PyramidView view = new PyramidView();
        PyramidModel model = new PyramidModel();
        PyramidController controller = new PyramidController(model, view);
        controller.getPyramid();
    }
}
