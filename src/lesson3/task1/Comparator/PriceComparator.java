package lesson3.task1.Comparator;

import lesson3.task1.Model.Toy.Toy;

import java.util.Comparator;

public class PriceComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        double t1 = ((Toy)o1).getPrice();
        double t2 = ((Toy)o2).getPrice();
        if (t1<t2){
            return 1;
        } else if(t1>t2){
            return -1;
        }else return 0;
    }
}
