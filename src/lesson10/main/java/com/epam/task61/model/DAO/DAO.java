package lesson10.main.java.com.epam.task61.model.DAO;

import java.util.List;

public interface DAO {
    List<String> showAllBooks();
    List<String> searchBooksByAuthor();
    List<String> searchBooksByPublisher();
    List<String> searchBooksAfterYear();

}
