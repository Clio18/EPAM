package project1.model;

import project1.entity.goods.Coffee;
import project1.source.SourceOfCoffee;

import java.util.ArrayList;

public class Model {
    private ArrayList<Coffee> coffeeList;

    public Model() {
        setCoffeeList(SourceOfCoffee.getListOfCoffee());
    }

    public ArrayList<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(ArrayList<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }
}
