package lesson10.main.java.com.epam.task61.model;

import com.epam.task61.model.entity.Book;
import java.util.Arrays;

public class Books implements IBooksDAO {
    private Book[] books;
    private int counter = 0;

    public Books() {
        books = new Book[10];
    }
    public Books(int size) {
        books = new Book[size];
    }

    @Override
    public Book[] getBooks() {
        return Arrays.copyOf(books, counter);
    }

    public void setBooks(Book[] books) {
        if (this.books.length - counter < books.length) {
            this.books = Arrays.copyOf(this.books,
                    this.books.length + books.length);
        }
        System.arraycopy(books, 0, this.books,
                counter, books.length);
        counter += books.length;
    }

    @Override
    public void addBook(Book book) {
        if (counter == books.length) {
            books = Arrays.copyOf(books,
                    books.length * 2);
        }
        books[counter++] = book;
    }

    @Override
    public Book[] getByAuthor(String author){
        Book[] temp = new Book[counter];
        int number = 0;
        for(int i=0; i<this.counter; i++){
             if(books[i].getAuthor().equalsIgnoreCase(author)){
                temp[number++] = books[i];
            }
        }
        return Arrays.copyOf(temp,number);
    }

    @Override
    public Book [] getByPublisher(String publisher){
        Book[] temp = new Book[books.length];
        int number = 0;
        for(int i=0; i<this.counter; i++){
            if(books[i].getPublish().equals(publisher)){
                temp[number++] = books[i];
            }
        }
        return Arrays.copyOf(temp,number);
    }

    @Override
    public Book[] getAfterYear(int year){
        Book[] temp = new Book[books.length];
        int number = 0;
        for(int i=0; i<this.counter; i++){
            if(books[i].getYear() >= year){
                temp[number++] = books[i];
            }
        }
        return Arrays.copyOf(temp,number);
    }

}