package lesson_11.src.main.java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO {
    public static final String INSERT_INTO_TASK_VALUES = "INSERT INTO Task VALUES (?, ?)";
    Connection con;
    Statement st;


    public UserDAO() {
        try {
            this.con = Service.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getAllStuff() {
        List<String> listOfStuff = new ArrayList<>();
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM Stuff";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listOfStuff.add(rs.getString(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3) + " "
                        + rs.getString(4) + " "
                        + rs.getString(5)); // считываем имя пользователя, полученной записи
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfStuff;
    }

    @Override
    public List<String> getAllTask() {
        List<String> listOfTask = new ArrayList<>();
        try {
            st = con.createStatement();
            String sql = "SELECT * FROM Task";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listOfTask.add(rs.getString(1) + " "
                        + rs.getString(2)); // считываем имя пользователя, полученной записи
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfTask;
    }

    @Override
    public List<String> getStuffFromDepartment(String department) {
        List<String> listOfStuf = new ArrayList<>();
        try {

            st = con.createStatement();
            String sql = "SELECT * FROM Stuff LEFT JOIN Departments ON Stuff.idDepartment = Departments.id" +
                    " WHERE Departments.name =" + "'" + department + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listOfStuf.add(rs.getString("firstName") + " "
                        + rs.getString("lastName")); // считываем имя пользователя, полученной записи
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfStuf;
    }

    @Override
    public void addTaskToStuff(int stuff, String description) {
        try {

            st = con.createStatement();
//            String sql = "INSERT INTO Task" +
//                    " VALUES(" + "'" + description + "'" + "," + "'" + stuff + "'" + ")";
            String sql = INSERT_INTO_TASK_VALUES;
            PreparedStatement prep = con.prepareStatement(sql);
            prep.setString(1, description);
            prep.setInt(2, stuff);
            int rs = st.executeUpdate(sql);
            //System.out.println("Done!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getTasksFromStuff(int id) {
        List<String> listOfTask = new ArrayList<>();
        try {

            st = con.createStatement();
            String sql = "SELECT description FROM Task" +
                    " WHERE Task.idstuf =" + "'" + id + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                listOfTask.add(rs.getString("description")); // считываем имя пользователя, полученной записи
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfTask;
    }
}
