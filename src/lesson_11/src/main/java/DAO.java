package lesson_11.src.main.java;

import java.util.List;

public interface DAO {
    List<String> getAllStuff();
    List<String> getAllTask();
    List<String> getStuffFromDepartment(String department);
    void addTaskToStuff(int stuff, String description);
    List<String> getTasksFromStuff(int id);

}
