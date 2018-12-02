package lesson10.main.java.com.epam.task61.model.DAO;

import com.epam.task61.model.IBooksDAO;
import com.epam.task61.model.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDAO implements IBooksDAO {
    Connection con;
    Statement st;

    public BookDAO() {
        try {
            this.con = ConnectionBook.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //ConnectionBook connectionBook;


    //    @Override
//    public List<String> showAllBooks() {
//        List<String> listOfBooks = new ArrayList<>();
//        try {
//            System.out.println("Connecting to a selected database...");
//            Connection con = connectionBook.getConnection();
//            System.out.println("Connected database successfully...");
//            Statement st = con.createStatement();
//            String sql = "SELECT * FROM BOOKS";
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                listOfBooks.add(rs.getString(1) + " " + rs.getString(2) + " "
//                        + rs.getString(3) + " " + rs.getString(4) + " " +
//                        rs.getString(5) + rs.getString(6));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return listOfBooks;
//    }

    @Override
    public Book[] getBooks() {
        List<Book> listOfBooks = new ArrayList<>();
        try {
            System.out.println("Connecting to a selected database...");
            System.out.println("Connected database successfully...");
            st = con.createStatement();
            String sql = "SELECT * FROM BOOKS";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listOfBooks.add(new Book(rs.getString("titul"), rs.getString("author"), rs.getString("publish"), rs.getInt("year"), rs.getInt("pages"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getArrayFromList(listOfBooks);
    }

    private Book[] getArrayFromList(List<Book> listOfBooks) {
        Book[] books = new Book[listOfBooks.size()];
        for (int i = 0; i < listOfBooks.size(); i++) {
            books[i] = listOfBooks.get(i);
        }
        return books;
    }

    @Override
    public void addBook(Book book) {
        List<Book> listOfBooks = new ArrayList<>();
        try {
            System.out.println("Connecting to a selected database...");
            System.out.println("Connected database successfully...");
            st = con.createStatement();
            String sql = "INSERT INTO BOOKS VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, book.getTitul());
            prep.setString(2, book.getAuthor());
            prep.setString(3, book.getPublish());
            prep.setInt(4, book.getYear());
            prep.setInt(5, book.getPages());
            prep.setDouble(6, book.getPrice());
            //ResultSet rs = prep.executeQuery();
            int rs = st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       // return getArrayFromList(listOfBooks);
    }

    @Override
    public Book[] getByAuthor(String author) {
        List<Book> listOfBooks = new ArrayList<>();
        try {
            System.out.println("Connecting to a selected database...");
            System.out.println("Connected database successfully...");
            st = con.createStatement();
            String sql = "SELECT * FROM BOOKS WHERE author = ?";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, author);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                listOfBooks.add(new Book(rs.getString("titul"), rs.getString("author"), rs.getString("publish"), rs.getInt("year"), rs.getInt("pages"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getArrayFromList(listOfBooks);
    }

    @Override
    public Book[] getByPublisher(String publisher) {
        List<Book> listOfBooks = new ArrayList<>();
        try {
            System.out.println("Connecting to a selected database...");
            System.out.println("Connected database successfully...");
            st = con.createStatement();
            String sql = "SELECT * FROM BOOKS WHERE publish = ?";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, publisher);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                listOfBooks.add(new Book(rs.getString("titul"), rs.getString("author"), rs.getString("publish"), rs.getInt("year"), rs.getInt("pages"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getArrayFromList(listOfBooks);
    }

    @Override
    public Book[] getAfterYear(int year) {
        List<Book> listOfBooks = new ArrayList<>();
        try {
            System.out.println("Connecting to a selected database...");
            System.out.println("Connected database successfully...");
            st = con.createStatement();
            String sql = "SELECT * FROM BOOKS WHERE year = ?";
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setInt(1, year);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                listOfBooks.add(new Book(rs.getString("titul"), rs.getString("author"), rs.getString("publish"), rs.getInt("year"), rs.getInt("pages"), rs.getDouble("price")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getArrayFromList(listOfBooks);
    }
}
