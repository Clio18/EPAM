package project1.view;

import java.util.ArrayList;

public class View<T> {
    public void printList(ArrayList<T> list){
        for (T t: list){
            System.out.println(t);
        }

    }
}
