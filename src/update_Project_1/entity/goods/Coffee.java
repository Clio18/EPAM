package update_Project_1.entity.goods;

import java.util.Objects;

public class Coffee {
    private String brand;
    private String pack;
    private String state;

    private double volume;
    private double weight;
    private double price;

    public Coffee(String brand, String pack, String state, double volume, double weight, double price) {
        this.brand = brand;
        this.pack = pack;
        this.state = state;
        this.volume = volume;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee: " +
                "brand - " + "\"" + brand + '\"' +
                ", packaging is: " + pack +
                ", state is: " + state +
                ", volume of 1 pack = " + volume +
                ", netto weight of 1 pack = " + weight +
                ", price per pack = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.volume, volume) == 0 &&
                Double.compare(coffee.weight, weight) == 0 &&
                Double.compare(coffee.price, price) == 0 &&
                Objects.equals(brand, coffee.brand) &&
                Objects.equals(pack, coffee.pack) &&
                Objects.equals(state, coffee.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, pack, state, volume, weight, price);
    }
}
