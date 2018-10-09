package lesson1.task1.Task1MVC;

public class InvertController {
    private InvertModel model;
    private InvertView view;

    public InvertController(InvertModel model, InvertView view) {
        this.model = model;
        this.view = view;
    }

    public void getInversion() {
        model.setValue(InputHelper.inputIntValueWithScanner(view));
        view.printMessageAndResult(view.OUR_INT, model.getNumberTo2(model.getValue()));
        view.printMessageAndResult(view.OUR_INT, model.getNumberTo8(model.getValue()));
        view.printMessageAndResult(view.OUR_INT, model.getNumberTo16(model.getValue()));
    }
}

