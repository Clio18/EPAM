package lesson2.task1.data;
import lesson2.task1.model.entity.Book;

public class Source {
    public static Book[] getBook(){
        return new Book[]{
                new Book("Title", "Shevchenko", "BXV", 2010, 320, 450.0),
                new Book("Title2", "Shevchenko", "Word", 2000, 125, 250.0),
                new Book("Title3", "Sokolov", "BXV", 1999, 820, 1050.0),
                new Book("Title4", "Sholohov", "Luch", 1939, 1020, 2200.0),
                new Book("Title5", "Abdul", "Luch", 2018, 100, 200.0),
                new Book("Title6", "Kemal", "RUH", 2008, 10, 2500.0),
                new Book("Title7", "Lu An", "China", 1998, 111, 250.0),
                new Book("Title8", "Pope", "Luch", 1888, 1110, 5750.0)
        };
    }
}
