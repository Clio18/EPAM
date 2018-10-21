package project1.entity.tracks;

import project1.entity.tracks.Car;

import java.util.ArrayList;

public class Track extends Car {
    private double fullVolume;
    private ArrayList listOfGoods;

    Track(String name, double fullVolume) {
        super(name);
        this.fullVolume = fullVolume;
    }

    public double getFullVolume() {

        return fullVolume;
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
