package patterns.builder.basket;

public class BasketInMarket {

    private String name;
    private double volume;
    private double meat;
    private double milk;
    private double bread;
    private double vegetables;
    private double somethingElse;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setMeat(double meat) {
        this.meat = meat;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setBread(double bread) {
        this.bread = bread;
    }

    public void setVegetables(double vegetables) {
        this.vegetables = vegetables;
    }

    public void setSomethingElse(double somethingElse) {
        this.somethingElse = somethingElse;
    }

    @Override
    public String toString() {
        return "BasketInMarket{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", meat=" + meat +
                ", milk=" + milk +
                ", bread=" + bread +
                ", vegetables=" + vegetables +
                ", somethingElse=" + somethingElse +
                '}';
    }
}
