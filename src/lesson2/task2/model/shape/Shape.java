package lesson2.task2.model.shape;

public abstract class Shape implements Drawable {
    private String ShapeColor;
    //public static double PI = 3.14;

    public Shape(String shapeColor) {
        ShapeColor = shapeColor;
    }

    public String getShapeColor() {
        return ShapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return " color = " + ShapeColor;
    }
}
