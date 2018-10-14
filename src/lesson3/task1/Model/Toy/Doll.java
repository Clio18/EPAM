package lesson3.task1.Model.Toy;

public class Doll extends Toy {
    private String typeOfDoll;

    public Doll(String name, String material, int ageFrom, double price, String typeOfDoll) {
        super(name, material, ageFrom, price);
        this.typeOfDoll=typeOfDoll;
    }

    public String getTypeOfDoll() {
        return typeOfDoll;
    }

    public void setTypeOfDoll(String typeOfDoll) {
        this.typeOfDoll = typeOfDoll;
    }

    @Override
    public String toString() {
        return this.getName() +
                " typeOfDoll = " + typeOfDoll + ", " +
                super.toString();
    }
}
