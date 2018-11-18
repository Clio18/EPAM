package update_Project_1.entity.traks;



import update_Project_1.entity.goods.Goods;

import java.util.ArrayList;

public class StarBucksTrak extends Track {
    private static String name = "STARBUCKS TRACK";
    private static double fullVolume = 10000.0;
    private static double money = 10000.0;
    private ArrayList<Goods> list = new ArrayList<>();

    public StarBucksTrak() {
        super(name, fullVolume, money);
    }

    public ArrayList<Goods> getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
}
