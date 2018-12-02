package lesson_11.src.main.java;

import java.sql.*;
import java.util.ResourceBundle;

public class Service {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ResourceBundle resource = ResourceBundle.getBundle("prop");
        String url = resource.getString("url");
        String user = resource.getString("user");
        String pass = resource.getString("password");
        return DriverManager.getConnection(url, user, pass);
    }

//    public static void main(String[] args) {
//        Connection con = null;
//        Statement st = null;
//        String url = "jdbc:postgresql://localhost:5432/lesson11";
//        String user = "postgres";
//        String pass = "admin";
//        try {
//            Class.forName("org.postgresql.Driver");
//            System.out.println("Connecting to a selected database...");
//            //con = DriverManager.getConnection(url, user, pass);
//            con = getConnection();
//            System.out.println("Connected database successfully...");
//            System.out.println("Creating table in given database...");
//            st = con.createStatement();
//            //String sql = "CREATE TABLE DEPARTMENTS " +
////                    "(id INTEGER not NULL, " +
////                    " name VARCHAR(30), " +
////                    " phone VARCHAR(15), " +
////                    " PRIMARY KEY ( id ))";
//            //ResultSet rs = st.executeQuery(sql);
//            System.out.println("Created table in given database...");
//            //String sql = "INSERT INTO DEPARTMENTS (id, name, phone) VALUES (1, 'Main', '500-10-10')";
//            //ResultSet rs = st.executeQuery(sql);
//            //String sql1 = "INSERT INTO DEPARTMENTS (id, name, phone) VALUES (2, 'Economic', '500-15-15')";
//            //String sql2 = "INSERT INTO DEPARTMENTS (id, name, phone) VALUES (3, 'Manufacturing', '500-20-20')";
//            //ResultSet rs = st.executeQuery(sql1);
//            //ResultSet rs = st.executeQuery(sql2);
////            String sql = "CREATE TABLE STUFF" +
//////                    "(id INTEGER not NULL, " +
//////                    " lastName VARCHAR(20), " +
//////                    " name VARCHAR(10), " +
//////                    " position VARCHAR(20), " +
//////                    "idDepartment INTEGER not NULL, " +
//////                    " PRIMARY KEY ( id )) ";
//////            ResultSet rs = st.executeQuery(sql);
//////            String sql = "INSERT INTO STUFF (id, lastName, name, position, idDepartment) " +
//////                    "VALUES (101, 'Smith', 'John', 'boss', 1), " +
//////                    " (202, 'Don', 'Din', 'manager', 2), (301, 'Van Damm', 'Jan', 'mechanic', 3)";
//////            ResultSet rs = st.executeQuery(sql);
////            String sql = "CREATE TABLE TASK" +
////                    "(description VARCHAR(50), " +
////                    "idStuf INTEGER not NULL)";
////            ResultSet rs = st.executeQuery(sql);
////            String sql = "INSERT INTO TASK (description, idStuf) " +
////                    "VALUES ('manage', 101), " +
////                    " ('calculate', 202), ('work', 301)";
////            ResultSet rs = st.executeQuery(sql);
////            String sql ="SELECT * FROM TASK";
////            ResultSet rs = st.executeQuery(sql);
////            while(rs.next()) {
////                System.out.println(rs.getString("description")); // считываем имя пользователя, полученной записи
////            }
////
////
////                        String sql = "CREATE TABLE BOOKS" +
////                    "(titul VARCHAR(200), " +
////                    "author VARCHAR(200), " +
////                    "publish VARCHAR(200), " +
////                    "year INTEGER not NULL, " +
////                    "pages INTEGER not NULL, " +
////                    "price NUMERIC not NULL)";
//
//
////            String sql = "INSERT INTO BOOKS (titul, author, publish, year, pages, price) " +
////                    "VALUES" + "('Book 1','Shevchenko','ABABAGALAMAGA',2010,100,150.0), "+
////                    " ('Java','Lenin','Kharkiv',2008,150,40.0), " +
////                    "('HTML','WWW consortium','Kyiv',2001,130,225.0), " +
////                    "('CSS','WWW consortium','Odessa',2018,333,26.0), " +
////                    "('JavaScript','WWW consortium','Lviv',2011,726,86.0), " +
////                    "('Python','Herbert Shild','Lviv',2011,376,86.0), " +
////                    "('Title1', 'Shevchenko','BXV', 2010, 320, 450.0), " +
////                    "('Title2', 'Shevchenko','Word', 2000, 120, 250.0), " +
////                    "('Title3', 'Sokolov','BXV', 1999, 820, 1050.0), " +
////                    "('Title4', 'Maslov','Piter', 2016, 555, 620.5), " +
////                    "('Title5', 'Sokolov','Piter', 2011, 876, 555.5), " +
////                    "('Title6', 'Alexandrov','BXV', 2001, 400, 300.0), " +
////                    "('Title7', 'Petrov','Word', 2018, 276, 155.5), " +
////                    "('Title8', 'Shevchenko','Piter', 2013, 456, 100.0)";
//
//            // ResultSet rs = st.executeQuery(sql);
//
//            String sql = "SELECT * FROM Stuff LEFT JOIN Departments ON Stuff.idDepartment = Departments.id WHERE Departments.name = 'Main'";
//            ResultSet rs = st.executeQuery(sql);
//            //System.out.println(rs.getMetaData().getColumnName(3));
//            while (rs.next()) {
//                System.out.println(rs.getString("firstName") + " " + rs.getString("lastName"));
//                        //+ rs.getString(2)); // считываем имя пользователя, полученной записи
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
    //}
}
