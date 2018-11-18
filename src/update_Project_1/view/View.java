package update_Project_1.view;



import update_Project_1.entity.goods.Coffee;
import update_Project_1.entity.goods.Goods;
import update_Project_1.entity.traks.StarBucksTrak;
import update_Project_1.model.Model;

import java.util.*;

public class View<T> implements UserInfo{
    private Menu menu = new Menu();
    private Scanner scanner = new Scanner(System.in);

    public void printList(ArrayList<T> list){
        for (T t: list){
            System.out.println(t);
        }
    }
    public void getListOfCommands() {
        for (String command : menu.getMenu()) {
            System.out.println(command);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
    public int inputValue() {
        return scanner.nextInt();
    }


    public String readCharacteristic(Model model) {
        System.out.println("Chose characteristic: ");
        System.out.println("1 <------ state, 2 <------ pack, 3 <------ brand");
        String characteristic = choseTheCharacteristic(scanner.nextInt());
        switch (characteristic) {
            case "state":

                System.out.println("Chose the type: ");
                System.out.println("1 <------ milled,2 <------ grain, 3 <------ soluble");
                return choseTheType(scanner.nextInt());
            case "pack":

                System.out.println("Chose the pack: ");
                System.out.println("1 <------- bag, 2 <------ stick, 3 <------ jar");
                return choseThePack(scanner.nextInt());
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
                return choseTheBrand(scanner.nextInt(), model.getCoffeeList());
        }

        return null;
    }

    public Coffee readCoffee(Model model) { //получаю выбрванный по типу и марке кофе
        System.out.println("Chose the type: ");
        System.out.println("1 <------ milled,2 <------ grain, 3 <------ soluble");
        String type = choseTheType(scanner.nextInt());
        ArrayList<Coffee> listOftypes = new ArrayList();
        for (Coffee coffee : model.getCoffeeList()) {
            if (coffee.getState().equals(type)) {
                listOftypes.add(coffee);
            }
        }

        System.out.println("Chose the brand: ");
        int count = 0;
        for (Coffee coffee : listOftypes) {
            System.out.println(coffee.getBrand() + " " + coffee.getPack() + " ------> " + count);
            count++;
        }
        String brand = choseTheBrand(scanner.nextInt(), listOftypes);
        Coffee result = null;
        for (Coffee coffee : listOftypes) {
            if (coffee.getBrand().equals(brand)) {
                result = coffee;
            }
        }
        return result;
    }

    public static String choseTheBrand(int button, List<Coffee> list) {//получаю масив кофе по типу и из него вибираю бренды
        ArrayList<String> listOfBrands = new ArrayList<>();
        for (Coffee coffee : list) {
            if (!listOfBrands.contains(coffee.getBrand())) {
                listOfBrands.add(coffee.getBrand());
            }
        }
        return listOfBrands.get(button);
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

    public void print(Collection<Goods> goodsFromTrack) {
        System.out.println(goodsFromTrack);
    }

    public void printStarBucksTrak(StarBucksTrak starBucksTrak) {
        for (Goods goods : starBucksTrak.getList()) {
            System.out.println(goods.toString());
        }
    }

    public int readQuantity() {
        System.out.println("Enter the amount of chosen goods: ");
        return scanner.nextInt();
    }
}
