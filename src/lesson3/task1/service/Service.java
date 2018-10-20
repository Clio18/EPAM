package lesson3.task1.service;

import lesson3.task1.Model.ActionRoom;
import lesson3.task1.Model.Toy.Car;
import lesson3.task1.Model.Toy.Doll;
import lesson3.task1.Model.Toy.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class Service<T extends Toy> {

    private ActionRoom actionRoom;

    public Service(ActionRoom actionRoom) {
        this.actionRoom = actionRoom;
    }

    public void totalPrice() {
        double sum = 0;
        for (Toy t : actionRoom.getListOfToys()) {
            sum = sum + t.getPrice();
        }
        System.out.println(sum);
    }

    public Toy [] getSortedByPrice(Comparator comparator) {
        Arrays.sort(actionRoom.getListOfToys(), comparator);
        return actionRoom.getListOfToys();
    }

    public T[] getToyByPriceAndAgeFrom(double price, int ageFrom) {
        T[] array = (T[]) new Toy[actionRoom.getListOfToys().length];
        int count = 0;
        if (ageFrom >= 0) {
            for (int i = 0; i < actionRoom.getListOfToys().length; i++) {
                if (actionRoom.getListOfToys()[i].getPrice() < price && actionRoom.getListOfToys()[i].getAgeFrom() > ageFrom) {
                    array[count++] = (T) actionRoom.getListOfToys()[i];
                }
            }
        }
        return Arrays.copyOf(array, count);
    }

    public T[] getToyByPriceAndAgeAndType(double price, int age, String typeOfToy) {
        T[] source = getToyByPriceAndAgeFrom(price, age);
        T[] finish = (T[]) new Toy[source.length];
        int count = 0;
        for (int i = 0; i < source.length; i++) {
            if ((source[i] instanceof Car && ((Car) source[i]).getTypeOfToy().equals(typeOfToy))) {
                finish[count++] = source[i];
            } else if ((source[i] instanceof Doll && ((Doll) source[i]).getTypeOfDoll().equals(typeOfToy))) {
                finish[count++] = source[i];
            }
        }
        return Arrays.copyOf(finish, count);
    }

}
