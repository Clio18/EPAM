package lesson4.src.test.java;

import lesson4.src.main.java.lesson2.task1.comparator.BookPublisherComparator;
import lesson4.src.main.java.lesson2.task1.model.Model;
import lesson4.src.main.java.lesson2.task1.model.entity.Book;
import lesson4.src.main.java.lesson2.task1.service.Service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {

    private Service service;

    @Before
    public void setUp() throws Exception {
        service = new Service(new Model());
    }

    @Test
    public void getByAuthorTest() {
        Book[] result = service.getByAuthor("Lu An");
        Assert.assertEquals(1, result.length);
        Assert.assertTrue(result.length == 1);
    }

    @Test
    public void getByPublisher() {
        Book[] result = service.getByPublisher("BXV");
        Assert.assertEquals(2, result.length);
        Assert.assertTrue(result.length == 2);
    }

    @Test
    public void getFromYear() {
        Book[] result = service.getBooksFromYear(2010);
        Assert.assertEquals(3, result.length);
        Assert.assertTrue(result.length == 3);
    }

    @Test
    public void getSortedBook() {
        Book[] result = service.getSortedBook("", new BookPublisherComparator());
        Assert.assertEquals(2010, result[0].getYear());
        Assert.assertTrue(result[0].getYear() == 2010 &&
                result[result.length - 1].getPublisher().startsWith("W"));
    }
}
