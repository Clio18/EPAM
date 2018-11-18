package update_Project_1.entity.traks;

import java.util.ArrayList;

public class Track {
    private double fullVolume;
    private double money;
    private ArrayList listOfGoods;
    private String name;

    Track(String name, double fullVolume, double money) {
        this.name = name;
        this.fullVolume = fullVolume;
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
