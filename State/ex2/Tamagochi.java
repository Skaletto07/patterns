package patterns.State.ex2;

public class Tamagochi {
    private int foodHungry;
    private int playHungry;
    private int sleepHungry;
    private State state;

    public Tamagochi() {
        state = new HungryState();
    }

    public void feed() {
        state.feed(this);
    }

    public void play() {

    }

    public void tikTak() {
        foodHungry++;
        System.out.println("my hungry: " + foodHungry);
        state.tikTak(this);
    }

    public int getFoodHungry() {
        return foodHungry;
    }

    public void setState(State state) {
        this.state = state;
    }
}
