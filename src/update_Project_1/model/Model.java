package update_Project_1.model;
import update_Project_1.entity.goods.Coffee;
import java.util.List;

public class Model {
    private List<Coffee> coffeeList;

    public Model(List<Coffee> coffees) {
        setCoffeeList(coffees);
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }
}
