package project1.entity.goods;

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
}
