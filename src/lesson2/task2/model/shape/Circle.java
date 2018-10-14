package lesson2.task2.model.shape;

public class Circle extends Shape {
    private double radius;


    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }


    @Override
    public double calcArea() {
        return Math.PI*Math.pow(radius, 2.0);
    }

    @Override
    public void draw() {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " with radius = " + radius +
                super.toString();
    }
}
