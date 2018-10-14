package lesson3.task1.Model.Toy;

public class Car extends Toy {
    private String typeOfCar;
    private boolean isMoveable;

    public Car(String name, String material, int ageFrom, double price, String typeOfCar, boolean isMoveable) {
        super(name, material, ageFrom, price);
        this.typeOfCar = typeOfCar;
        this.isMoveable = isMoveable;
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

    @Override
    public String toString() {
        return this.getName() +
                " typeOfCar = " + typeOfCar +
                ", isMoveable = " + isMoveable + ", " +
                super.toString();
    }
}
