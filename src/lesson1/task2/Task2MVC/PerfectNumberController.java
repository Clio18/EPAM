package lesson1.task2.Task2MVC;

public class PerfectNumberController {
    private PerfectNumberModel perfectNumberModel;
    private PerfectNumberView perfectNumberView;

    public PerfectNumberController(PerfectNumberModel perfectNumberModel, PerfectNumberView perfectNumberView) {
        this.perfectNumberModel = perfectNumberModel;
        this.perfectNumberView = perfectNumberView;
    }

    public void calculate() {
        perfectNumberModel.setNumber(InputHelper.inputIntValueWithScanner(perfectNumberView));
        perfectNumberView.printMessageAndResult(perfectNumberView.OUTPUT, perfectNumberModel.getPerfectNumber(perfectNumberModel.getNumber()));
    }
}

