package lesson3.task1.Model;

import lesson3.task1.Comparator.PriceComparator;
import lesson3.task1.Model.Toy.Toy;

import java.util.Arrays;

public class ActionRoom<T extends Toy> {
    private T[] listOfToys;

    public T[] getListOfToys() {
        return listOfToys;
    }

    public void setListOfToys(T[] listOfToys) {
        this.listOfToys = listOfToys;
    }

    public void totalPrice() {
        double sum = 0;
        for (T t : listOfToys) {
            sum = sum + t.getPrice();
        }
        System.out.println(sum);
    }

    public T[] getSortedByPrice() {
        Arrays.sort(listOfToys, new PriceComparator());
        return listOfToys;
    }

    public T[] getToyByPriceAndAgeFrom(double price, int ageFrom) {
        T[] array = (T[]) new Toy[listOfToys.length];
        int count = 0;
        for (int i = 0; i < listOfToys.length; i++) {
            if (listOfToys[i].getPrice() < price && listOfToys[i].getAgeFrom() > ageFrom) {
                array[count++] = listOfToys[i];
            }
        }
        return Arrays.copyOf(array, count);
    }

}
