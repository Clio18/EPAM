package lesson5.task2;

import java.util.*;

public class SetAndList {
    public static void main(String[] args) {
        System.out.println(makeList(0, 10, 20));
        System.out.println(makeSet(0, 10, 4));
        //сгенерировать 100 значений в диапазоне от 0 до 20, в случае листа-непроблеиа, в случае сета-повторы значений
    }

    public static List makeList(int first, int last, int elements) {
        List result = new ArrayList();
        for (int i = 0; i < elements; i++) {
            result.add((int) (Math.random() * (last - first) + 1));
        }
        return result;
    }

    public static Set makeSet(int first, int last, int elements) {
        Set result = new HashSet();
        for (int i = 0; i < elements; i++) {
            result.add((int) (Math.random() * (last - first) + 1));
        }
        if (result.size() != elements) {
            result = null;
        }
        return result;
    }
}