package lesson2.task2.source;

import lesson2.task2.model.shape.Circle;
import lesson2.task2.model.shape.Rectangle;
import lesson2.task2.model.shape.Shape;
import lesson2.task2.model.shape.Triangle;

public class Source {
    public static Shape[] getListOfShapes() {
        return new Shape[]{
                new Rectangle("red", 10.0, 10.0),
                new Rectangle("white", 15.0, 10.0),
                new Rectangle("red", 100.0, 9.5),
                new Triangle("blue", 32.1, 19.5),
                new Triangle("blue", 24.7, 9.5),
                new Triangle("orange", 4.7, 1.5),
                new Circle("white", 9.8),
                new Circle("black", 99.8),
                new Circle("blue", 1.8)
        };
    }
}
