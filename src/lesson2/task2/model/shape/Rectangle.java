package lesson2.task2.model.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(String shapeColor, double length, double width) {
        super(shapeColor);
        this.length = length;
        this.width = width;
    }


    @Override
    public double calcArea() {
        return length * width;
    }

    @Override
    public void draw() {

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " with length = " + length +
                " and width = " + width +
                super.toString();
    }
}
