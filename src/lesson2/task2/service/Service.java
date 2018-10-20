package lesson2.task2.service;

import lesson2.task2.model.Model;
import lesson2.task2.model.shape.Shape;

public class Service {
    private Model model;

    public Service() {
        this.model = new Model();
    }

    public Model getModel() {
        return model;
    }

    public double getSumSquare(){
        double sum = 0;
        for (Shape shape:model.getListOfShapes()){
            sum = sum + shape.calcArea();
        }
        return sum;
    }
    public double getSumSquareOfDefiniteShape(String s){
        double sum = 0;
        for (Shape shapes:model.getListOfShapes()){
            if (shapes.getClass().getSimpleName().toLowerCase().equals(s.toLowerCase())){
                sum = sum + shapes.calcArea();
            }
        }
        return sum;
    }
}
