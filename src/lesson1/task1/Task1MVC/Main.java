package lesson1.task1.Task1MVC;

public class Main {
    public static void main(String[] args) {
        InvertModel model = new InvertModel();
        InvertView view = new InvertView();
        InvertController controller = new InvertController(model, view);
        controller.getInversion();
    }
}
