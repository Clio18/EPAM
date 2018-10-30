package project1.service;

import project1.entity.goods.Coffee;
import project1.entity.goods.Goods;
import project1.entity.tracks.StarBucksTrak;
import project1.model.Model;

import java.util.*;

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
        } else {
            System.out.println("Is full");
            return starBucksTrak;
        }
        starBucksTrak.getList().add(goods);
        return starBucksTrak;
    }

    public void printStarBucksTrak() {
        for (Goods goods : starBucksTrak.getList()) {
            System.out.println(goods.toString());
        }
    }

    public void printSorted(Comparator comparator) {
        starBucksTrak.getList().sort(comparator);
        printStarBucksTrak();
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

    public List<String> makeRequest() {
        List<String> request = new ArrayList();
        System.out.println("Chose characteristic: ");
        System.out.println("state - 1, pack - 2, brand - 3");
        String characteristic = choseTheCharacteristic(scanner.nextInt());
        switch (characteristic) {
            case "state":

                System.out.println("Chose the type: ");
                System.out.println("milled - 1, grain - 2, soluble - 3");
                request.add(choseTheType(scanner.nextInt()));
            case "pack":

                System.out.println("Chose the pack: ");
                System.out.println("bag - 1, stick - 2, jar - 3");
                request.add(choseThePack(scanner.nextInt()));
            case "brand":

                System.out.println("The list of brands: ");
                List<String> brands = new ArrayList<>();
                for (Coffee coffee : model.getCoffeeList()) {
                    if (!brands.contains(coffee.getBrand())) {
                        brands.add(coffee.getBrand());
                    }
                }
                int count = 0;
                for (String bradName : brands) {
                    System.out.print(bradName + " - " + count + " ");
                    count++;
                }
                System.out.println();
                request.add(choseTheBrand(scanner.nextInt(), model.getCoffeeList()));
        }
        return request;

    }

    public static String choseTheCharacteristic(int button) {
        String type = "";
        switch (button) {
            case 1:
                type = "state";
                break;
            case 2:
                type = "pack";
                break;
            case 3:
                type = "brand";
                break;
        }
        return type;
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

    public static String choseThePack(int button) {
        String type = "";
        switch (button) {
            case 1:
                type = "bag";
                break;
            case 2:
                type = "stick";
                break;
            case 3:
                type = "jar";
                break;
        }
        return type;
    }

    public String choseTheBrand(int button, ArrayList<Coffee> list) {//получаю масив кофе по типу и из него вибираю бренды
        ArrayList<String> listOfBrands = new ArrayList<>();
        for (Coffee coffee : list) {
            if (!listOfBrands.contains(coffee.getBrand())) {
                listOfBrands.add(coffee.getBrand());
            }
        }
        return listOfBrands.get(button);
    }

    public void findGoodsFromTrack(List<String> request) {
        List<Coffee> findCoffee = new ArrayList<>();
        for (String characteristic : request) {
            for (Coffee coffee : model.getCoffeeList()) {
                if (coffee.getState() == characteristic || coffee.getPack() == characteristic || coffee.getBrand() == characteristic) {
                    findCoffee.add(coffee);
                }
            }
        }
        Set<Goods> set = new HashSet<>();
        for (Goods goods : starBucksTrak.getList()) {
            for (Coffee coffee : findCoffee) {
                if (goods.getCoffee().equals(coffee)) {
                    set.add(goods);
                }
            }
        }
        System.out.println(set);
    }

}


