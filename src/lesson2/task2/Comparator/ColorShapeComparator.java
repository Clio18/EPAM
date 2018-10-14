package lesson2.task2.Comparator;

import lesson2.task2.model.shape.Shape;

import java.util.Comparator;

public class ColorShapeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Shape) o1).getShapeColor();
        String color2 = ((Shape) o2).getShapeColor();
        return color1.compareTo(color2);
    }
}
