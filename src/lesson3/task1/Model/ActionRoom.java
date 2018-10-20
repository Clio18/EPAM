package lesson3.task1.Model;

import lesson3.task1.Model.Toy.Toy;
import lesson3.task1.Source.SourceOfToys;

public class ActionRoom<T extends Toy> {
    private T[] listOfToys;

    public ActionRoom() {
       setListOfToys((T[]) SourceOfToys.getToy());
    }

    public T[] getListOfToys() {
        return listOfToys;
    }

    public void setListOfToys(T[] listOfToys) {
        this.listOfToys = listOfToys;
    }
}
