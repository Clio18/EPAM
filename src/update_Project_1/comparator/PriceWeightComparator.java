package update_Project_1.comparator;



import update_Project_1.entity.goods.Goods;

import java.util.Comparator;

public class PriceWeightComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Double d1 = ((Goods)o1).getCoffee().getPrice()/((Goods)o1).getCoffee().getWeight();
        Double d2 = ((Goods)o2).getCoffee().getPrice()/((Goods)o2).getCoffee().getWeight();
        if (d1<d2){
            return 1;
        } else if(d1>d2){
            return -1;
        } else return 0;
    }
}
