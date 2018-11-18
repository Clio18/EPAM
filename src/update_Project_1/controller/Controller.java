package update_Project_1.controller;

import update_Project_1.comparator.PriceWeightComparator;
import update_Project_1.entity.goods.Coffee;
import update_Project_1.entity.goods.Goods;
import update_Project_1.entity.traks.StarBucksTrak;
import update_Project_1.model.Model;
import update_Project_1.service.Service;
import update_Project_1.source.SourceOfCoffee;
import update_Project_1.view.Menu;
import update_Project_1.view.View;

import java.util.List;
import java.util.Set;

public class Controller {

    private Service service = new Service();
    private View view = new View();

    public void run() {
        view.getListOfCommands();
        view.printMessage(view.MAIN_COMMAND);
        Model model = new Model(SourceOfCoffee.getListOfCoffee());
        StarBucksTrak starBucksTrak = new StarBucksTrak();
        while (true) {
            int number = view.inputValue();
            if (number >= new Menu().getMenu().length || number < 0) {
                view.printMessage(view.NOT_VALID);
            } else
                switch (number) {
                    case 1:
                        view.getListOfCommands();
                        break;
                    case 2:
                        Coffee coffee = view.readCoffee(model);
                        service.fillTrack(starBucksTrak, coffee, view.readQuantity());
                        view.printStarBucksTrak(starBucksTrak);
                        break;
                    case 3:
                        List<Goods> goods = service.getSortedGoods(starBucksTrak, new PriceWeightComparator());
                        view.print(goods);
                        break;
                    case 4:
                        List<String> request = service.makeRequest(view.readCharacteristic(model));
                        System.out.println(request);
                        Set<Goods> goodsFromTrack = service.findGoodsFromTrack(request, starBucksTrak);
                        view.print(goodsFromTrack);
                        break;
                    case 0:
                        return;
                }
        }
    }
}
