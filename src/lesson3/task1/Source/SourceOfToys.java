package lesson3.task1.Source;

import lesson3.task1.Model.Toy.Car;
import lesson3.task1.Model.Toy.Doll;
import lesson3.task1.Model.Toy.Game;
import lesson3.task1.Model.Toy.Toy;

public class SourceOfToys {
    public static Toy [] getToy(){
        return new Toy[]{
                new Game("Nards", "Wood", 10, 189.99, 2, 1),
                new Doll("Barbi", "plastic", 3, 20.75, "for girls"),
                new Car("Ferrari", "metal", 2, 1000.1, "cabriolet", false)
        };
    }
}
