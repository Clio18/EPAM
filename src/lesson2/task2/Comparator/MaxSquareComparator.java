package lesson2.task2.Comparator;

import lesson2.task2.model.shape.Shape;

import java.util.Comparator;

public class MaxSquareComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Double d1 = ((Shape)o1).calcArea();
        Double d2 = ((Shape)o2).calcArea();
        if (d1<d2){
            return 1;
        } else if(d1>d2){
            return -1;
        } else return 0;
        //return d1.compareTo(d2);
    }
}
