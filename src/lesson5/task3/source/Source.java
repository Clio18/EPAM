package lesson5.task3.source;

import java.util.HashMap;
import java.util.Map;

public class Source {
    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("blue", "синий");
        map.put("elephant", "слон");
        map.put("wooden", "деревяний");
        map.put("table", "стол");
        map.put("red", "красний");
        map.put("book", "книга");
        map.put("big", "большая");
        map.put("small", "маленькая");
        map.put("room", "комната");
        map.put("day", "день");
        return map;
    }
}
