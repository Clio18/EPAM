package lesson3.task2.Comparator;

import lesson3.task2.Model.Shop;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((Shop.Department)o1).getPosition();
        int s2 = ((Shop.Department)o2).getPosition();
        if (s1<s2){
            return -1;
        } else if (s1>s2){
            return 1;
        } else return 0;
    }
}
