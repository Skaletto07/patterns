package patterns.State.ex2;

public class HungryState implements State {

    @Override
    public void feed(Tamagochi tamagochi) {

    }

    @Override
    public void play(Tamagochi tamagochi) {

    }

    @Override
    public void sleep(Tamagochi tamagochi) {

    }

    @Override
    public void tikTak(Tamagochi tamagochi) {
        if (tamagochi.getFoodHungry() > 100) {
            tamagochi.setState(new DeadState());
        } else if (tamagochi.getFoodHungry() < 50) {
            tamagochi.setState(new FedState());
        } else {
            System.out.println("I'm hungry!");
        }
    }
}
