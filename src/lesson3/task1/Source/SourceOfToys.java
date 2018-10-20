package lesson3.task1.Source;

import lesson3.task1.Model.Toy.Car;
import lesson3.task1.Model.Toy.Doll;
import lesson3.task1.Model.Toy.Game;
import lesson3.task1.Model.Toy.Toy;

public class SourceOfToys {
    public static Toy [] getToy(){
        return new Toy[]{
                new Game("Nards", "Wood", 10, 189.99, 2, 1),
                new Game("Chess", "Wood", 11, 89.99, 2, 2),
                new Doll("Barbi", "plastic", 3, 20.75, "girl"),
                new Doll("Transformer", "plastic", 4, 210.75, "boy"),
                new Doll("Robot", "metal", 5, 2210.75, "boy"),
                new Doll("Leya", "plastic", 5, 1210.75, "girl"),
                new Doll("Sofia", "plastic", 6, 110.75, "girl"),
                new Car("Ferrari", "metal", 2, 1000.1, "cabriolet", true, "boy"),
                new Car("Porsch", "metal", 2, 100.1, "sedan", true, "boy"),
                new Car("Zaporozhets", "metal", 10, 10.1, "limousine", false, "boy"),
                new Car("Carriage", "wood", 3, 100.99, "cabriolet", true, "girl")
        };
    }
}
