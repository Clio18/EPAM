package project1.source;

import project1.entity.goods.Coffee;

import java.util.ArrayList;

public class SourceOfCoffee {
    public static ArrayList<Coffee> getListOfCoffee() {
        ArrayList<Coffee> list = new ArrayList<Coffee>();

        list.add(new Coffee("Lavazza", "bag", "milled", 20.0, 25, 2000.0));
        list.add(new Coffee("Lavazza", "bag", "grain", 20.0, 15, 1600.0));

        list.add(new Coffee("Chibo", "bag", "milled", 20.0, 18, 1890.99));
        list.add(new Coffee("Chibo", "bag", "grain", 20.0, 10, 999.0));

        list.add(new Coffee("Nescafe", "stick", "soluble", 0.002, 0.002, 2.35));
        list.add(new Coffee("Nescafe", "jar", "soluble", 0.1, 0.2, 90.5));

        list.add(new Coffee("Davidoff", "bag", "milled", 20.0, 25, 1750.0));
        list.add(new Coffee("Davidoff", "bag", "grain", 20.0, 15, 870.0));
        list.add(new Coffee("Davidoff", "stick", "soluble", 0.002, 0.002, 3.45));
        list.add(new Coffee("Davidoff", "jar", "soluble", 0.25, 0.25, 170.99));

        return list;
    }
}
