package lesson3.task1.Model.Toy;

public class Doll extends Toy {
    private String typeOfToy;

    public Doll(String name, String material, int ageFrom, double price, String typeOfToy) {
        super(name, material, ageFrom, price);
        this.typeOfToy=typeOfToy;
    }

    public String getTypeOfDoll() {
        return typeOfToy;
    }

    public void setTypeOfDoll(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }

    @Override
    public String toString() {
        return this.getName() +
                " typeOfToy = " + typeOfToy + ", " +
                super.toString();
    }
}
