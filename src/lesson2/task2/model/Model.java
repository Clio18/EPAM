package lesson2.task2.model;
import lesson2.task2.model.shape.*;
import lesson2.task2.source.Source;

public class Model {
    private Shape [] listOfShapes;

    public Model() {
        setListOfShapes(Source.getListOfShapes());
    }

    public Shape[] getListOfShapes() {
        return listOfShapes;
    }

    public void setListOfShapes(Shape[] listOfShapes) {
        this.listOfShapes = listOfShapes;
    }
}
