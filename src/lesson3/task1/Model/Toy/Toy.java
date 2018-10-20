package lesson3.task1.Model.Toy;

public abstract class Toy { //должен быть абстракт
    private String name;
    private String material;
    private int ageFrom;
    private double price;

    public Toy(String name, String material, int ageFrom, double price) {
        this.name = name;
        this.material = material;
        this.ageFrom = ageFrom;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(int ageFrom) {
        this.ageFrom = ageFrom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy" +
                " name = " + name +
                ", material = " + material +
                ", ageFrom = " + ageFrom +
                ", price = " + price;
    }
}
