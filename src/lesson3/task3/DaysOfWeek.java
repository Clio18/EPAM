package lesson3.task3;

import java.util.HashMap;
import java.util.Map;

public class DaysOfWeek extends CLASSENUM {
    public static final int MONDAY_ID = 1;
    public static final String MONDAY_VIEW = "MONDAY";
    public static final DaysOfWeek MONDAY = new DaysOfWeek(MONDAY_ID, MONDAY_VIEW);

    public static final int TUESDAY_ID = 2;
    public static final String TUESDAY_VIEW = "TUESDAY";
    public static final DaysOfWeek TUESDAY = new DaysOfWeek(TUESDAY_ID, TUESDAY_VIEW);

    public static final int WEDNESDAY_ID = 3;
    public static final String WEDNESDAY_VIEW = "WEDNESDAY";
    public static final DaysOfWeek WEDNESDAY = new DaysOfWeek(WEDNESDAY_ID, WEDNESDAY_VIEW);

    public static final int THURSDAY_ID = 4;
    public static final String THURSDAY_VIEW = "THURSDAY";
    public static final DaysOfWeek THURSDAY = new DaysOfWeek(THURSDAY_ID, THURSDAY_VIEW);

    public static final int FRIDAY_ID = 5;
    public static final String FRIDAY_VIEW = "FRIDAY";
    public static final DaysOfWeek FRIDAY = new DaysOfWeek(FRIDAY_ID, FRIDAY_VIEW);

    public static final int SATURDAY_ID = 6;
    public static final String SATURDAY_VIEW = "SATURDAY";
    public static final DaysOfWeek SATURDAY = new DaysOfWeek(SATURDAY_ID, SATURDAY_VIEW);

    public static final int SANDAY_ID = 7;
    public static final String SANDAY_VIEW = "SANDAY";
    public static final DaysOfWeek SANDAY = new DaysOfWeek(SANDAY_ID, SANDAY_VIEW);

//    public static final DaysOfWeek[] daysOfWeeks = new DaysOfWeek[]{
//            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SANDAY
//    };
    public static final Map<Integer, String> map = new HashMap<Integer, String>(){{
        put(MONDAY_ID, MONDAY_VIEW);
        put(TUESDAY_ID, TUESDAY_VIEW);
        put(WEDNESDAY_ID, WEDNESDAY_VIEW);
        put(THURSDAY_ID, THURSDAY_VIEW);
        put(FRIDAY_ID, FRIDAY_VIEW);
        put(SATURDAY_ID, SATURDAY_VIEW);
        put(SANDAY_ID, SANDAY_VIEW);
    }};


    private DaysOfWeek(int id, String name) {
        super(id, name);
    }

}
