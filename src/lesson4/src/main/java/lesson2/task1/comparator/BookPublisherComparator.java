package lesson4.src.main.java.lesson2.task1.comparator;



import lesson4.src.main.java.lesson2.task1.model.entity.Book;

import java.util.Comparator;

public class BookPublisherComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String publisher1 = ((Book)o1).getPublisher();
        String publisher2 = ((Book)o2).getPublisher();
        return publisher1.compareTo(publisher2);
    }
}
