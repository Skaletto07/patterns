package patterns.State.ex2;

public class DeadState implements State {
    @Override
    public void feed(Tamagochi tamagochi) {
        System.out.println("DEAD!!! no need food");
    }

    @Override
    public void play(Tamagochi tamagochi) {

    }

    @Override
    public void sleep(Tamagochi tamagochi) {

    }

    @Override
    public void tikTak(Tamagochi tamagochi) {
        System.out.println("I'M DEAD!");
    }
}
