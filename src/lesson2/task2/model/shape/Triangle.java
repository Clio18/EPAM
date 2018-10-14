package lesson2.task2.model.shape;

public class Triangle extends Shape {
    private double length;
    private double width;

    public Triangle(String shapeColor) {
        super(shapeColor);
    }

    public Triangle(String shapeColor, double length, double width) {
        super(shapeColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return (length * width)/2;
    }

    @Override
    public void draw() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " with first side = " + length +
                " and second side = " + width +
                super.toString();

    }
}
