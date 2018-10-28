package project1.entity.goods;

public class Goods {
    private Coffee coffee;
    private int quantity;

    public Goods(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Goods is: " +
                coffee + ", " + "\n" +
                "Quantity: " + quantity;
    }
}
