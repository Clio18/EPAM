package project1.service;

import project1.entity.goods.Coffee;
import project1.entity.goods.Goods;
import project1.entity.tracks.StarBucksTrak;
import project1.model.Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private Model model;//список доступного кофе
    private StarBucksTrak starBucksTrak = new StarBucksTrak();//грузовик опеделенного обьема
    private Goods goods;//тарное место (определенный кофе и его вес)
    private double order;//сумма денег на заказ грузовика

    Scanner scanner = new Scanner(System.in);

    public Service() {
        this.model = new Model();
    }

    public Model getModel() {
        return model;
    }

    public StarBucksTrak getFullTrack() {//полученному кофе буду сетить его количество и проверять хватит ли
        //обьема грузовика. Далее буду сетить тарные места в грузовик
        Goods goods = createGoods();
        System.out.println("Enter guantity of chosen goods: ");
        int quantity = scanner.nextInt();
        if (goods.getCoffee().getVolume() * quantity < starBucksTrak.getFullVolume()) {
            goods.setQuantity(quantity);
        }

        starBucksTrak.getList().add(goods);
        return starBucksTrak;
    }

    public void printStarBucksTrak() {
        for (Goods goods : starBucksTrak.getList()) {
            System.out.println(
                    "Good is: " + goods.getCoffee() + "\n" + "Quantity is: " + goods.getQuantity());
        }
    }

    public Goods createGoods() { //получаю выбрванный по типу и марке кофе
        System.out.println("Chose the type: ");
        System.out.println("milled - 1, grain - 2, soluble - 3");
        String type = choseTheType(scanner.nextInt());
        ArrayList<Coffee> listOftypes = new ArrayList();
        for (Coffee coffee : model.getCoffeeList()) {
            if (coffee.getState() == type) {
                listOftypes.add(coffee);
            }
        }

        System.out.println("Chose the brand: ");
        int count = 0;
        for (Coffee coffee : listOftypes) {
            System.out.println(coffee.getBrand() + " " + coffee.getPack() + " " + count);
            count++;
        }
        String brand = choseTheBrand(scanner.nextInt(), listOftypes);
        Coffee result = null;
        for (Coffee coffee : listOftypes) {
            if (coffee.getBrand() == brand) {
                result = coffee;
            }
        }
        return new Goods(result);
    }

    public static String choseTheType(int button) {
        String type = "";
        switch (button) {
            case 1:
                type = "milled";
                break;
            case 2:
                type = "grain";
                break;
            case 3:
                type = "soluble";
                break;
        }
        return type;
    }

    public String choseTheBrand(int button, ArrayList<Coffee> list) {//получаю масив кофе по типу и из него вибираю бренды
        ArrayList<String> listOfBrands = new ArrayList<>();
        for (Coffee coffee : list) {
            listOfBrands.add(coffee.getBrand());
        }
        return listOfBrands.get(button);
    }

}


