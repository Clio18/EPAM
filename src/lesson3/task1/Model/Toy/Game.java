package lesson3.task1.Model.Toy;

public class Game extends Toy{
    private int numberOfPlayers;
    private int minDuration;
    public Game(String name, String material, int ageFrom, double price, int numberOfPlayers, int minDuration) {
        super(name, material, ageFrom, price);
        this.numberOfPlayers = numberOfPlayers;
        this.minDuration = minDuration;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getMinDuration() {
        return minDuration;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    @Override
    public String toString() {
        return this.getName() +
                " numberOfPlayers = " + numberOfPlayers +
                " minDuration of playing = " + minDuration + ", " +
                super.toString();
    }
}
