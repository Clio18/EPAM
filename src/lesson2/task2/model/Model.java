package lesson2.task2.model;
import lesson2.task2.model.shape.*;

public class Model {
    private Shape [] listOfShapes;

    public Shape[] getListOfShapes() {
        return listOfShapes;
    }

    public void setListOfShapes(Shape[] listOfShapes) {
        this.listOfShapes = listOfShapes;
    }
    public double getSumSquare(){
        double sum = 0;
        for (Shape shape:listOfShapes){
            sum = sum + shape.calcArea();
        }
        return sum;
    }
    public double getSumSquareOfDefiniteShape(String s){
        double sum = 0;
        for (Shape shapes:listOfShapes){
            if (shapes.getClass().getSimpleName().toLowerCase().equals(s.toLowerCase())){
                sum = sum + shapes.calcArea();
            }
        }
        if (sum==0){
            System.out.println("Wrong shape: " + s);
        }
        return sum;
    }
}
