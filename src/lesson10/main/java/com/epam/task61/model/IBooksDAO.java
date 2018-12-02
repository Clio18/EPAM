package lesson10.main.java.com.epam.task61.model;

import com.epam.task61.model.entity.Book;

public interface IBooksDAO {
    Book[] getBooks();

    void addBook(Book book);

    Book[] getByAuthor(String author);

    Book [] getByPublisher(String publisher);

    Book[] getAfterYear(int year);
}
