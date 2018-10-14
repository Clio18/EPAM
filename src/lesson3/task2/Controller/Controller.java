package lesson3.task2.Controller;

import lesson3.task2.Model.Shop;

public class Controller {
    private Shop shop = new Shop();
    public void run(){
        shop.setDepartments();
        shop.showShop();
        //shop.departmentCreations();
        System.out.println();
        shop.deleteDepartment("NewPost");
        shop.showShop();
        shop.sortDepartmentByTypeOfSells();
        System.out.println();
        shop.showShop();
    }

}
