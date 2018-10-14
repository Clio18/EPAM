package lesson1.task3.Task3MVC;

public class PyramidController {
    private PyramidModel model;
    private PyramidView view;

    public PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    public void getPyramid() {
        model.setNumber(new InputHelper().inputIntValueWithScanner(view));
        model.setArray(model.getNumber());

        view.printMessageAndResult(view.OUR_INT, model.getPyramid());
    }
}

