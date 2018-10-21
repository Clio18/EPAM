package project1.entity.tracks;

import project1.entity.goods.Goods;

import java.util.ArrayList;

public class StarBucksTrak extends Track {
    private static String name = "STARBUCKS TRACK";
    private static double fullVolume = 10000.0;
    private ArrayList<Goods> list = new ArrayList<>();

    public StarBucksTrak() {
        super(name, fullVolume);
    }

    public ArrayList<Goods> getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
