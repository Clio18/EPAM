package project1.entity.tracks;

import java.util.ArrayList;

public class Track {
    private double fullVolume;
    private ArrayList listOfGoods;
    private String name;

    Track(String name, double fullVolume) {
        this.name = name;
        this.fullVolume = fullVolume;
    }

    public double getFullVolume() {
        return fullVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullVolume(double fullVolume) {
        this.fullVolume = fullVolume;
    }

    public ArrayList getListOfGoods() {
        return listOfGoods;
    }

    public void setListOfGoods(ArrayList listOfGoods) {
        this.listOfGoods = listOfGoods;
    }
}
