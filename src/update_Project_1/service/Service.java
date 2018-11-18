package update_Project_1.service;
import update_Project_1.entity.goods.Coffee;
import update_Project_1.entity.goods.Goods;
import update_Project_1.entity.traks.StarBucksTrak;

import java.util.*;
import java.util.stream.Collectors;

public class Service {

    public double fillTrack(StarBucksTrak starBucksTrak, Coffee coffee, int quantity) {//полученному кофе буду сетить его количество и проверять хватит ли
        double value = starBucksTrak.getFullVolume();
        Goods goods = createGoods(coffee);
        if (goods.getCoffee().getVolume() * quantity < starBucksTrak.getFullVolume()) {
            if (starBucksTrak.getMoney() > goods.getCoffee().getPrice() * quantity){
                goods.setQuantity(quantity);
                starBucksTrak.getList().add(goods);
                value = value - goods.getCoffee().getVolume() * quantity;
                System.out.println("The left volume is: " + value);
                return value;
            } else {
                System.out.println("Is full money");
            }
        } else {
            System.out.println("Is full");
        }
        return value;
    }

    public List<Goods> getSortedGoods(StarBucksTrak trak, Comparator comparator) {
        ArrayList<Goods> list = trak.getList();
        list.sort(comparator);
        return list;
    }

    public Goods createGoods(Coffee coffee) { //получаю выбрванный по типу и марке кофе
        return new Goods(coffee);
    }

    public List<String> makeRequest(String characteristic) {
        List<String> request = new ArrayList();
        request.add(characteristic);
        return request;
    }

    public Set<Goods> findGoodsFromTrack(List<String> request, StarBucksTrak trak) {
        Set<Goods> set = new HashSet<>();
        for (String characteristic : request) {
            return trak.getList()
                    .stream()
                    .filter(goods -> goods.getCoffee().getState().equals(characteristic)
                            || goods.getCoffee().getPack().equals(characteristic)
                            || goods.getCoffee().getBrand().equals(characteristic))
                    .collect(Collectors.toSet());

        }
        return set;
    }

}


