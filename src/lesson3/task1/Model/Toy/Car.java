package lesson3.task1.Model.Toy;

public class Car extends Toy {
    private String typeOfCar;
    private boolean isMoveable;
    private String typeOfToy;

    public Car(String name, String material, int ageFrom, double price, String typeOfCar, boolean isMoveable, String typeOfToy) {
        super(name, material, ageFrom, price);
        this.typeOfCar = typeOfCar;
        this.isMoveable = isMoveable;
        this.typeOfToy = typeOfToy;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public boolean isMoveable() {
        return isMoveable;
    }

    public void setMoveable(boolean moveable) {
        isMoveable = moveable;
    }

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }

    @Override
    public String toString() {
        return this.getName() +
                " typeOfCar = " + typeOfCar +
                ", isMoveable = " + isMoveable +
                ", type  of toy = " + typeOfToy + ", " +
                super.toString();
    }
}
