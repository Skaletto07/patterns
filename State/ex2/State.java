package patterns.State.ex2;

public interface State {
    void feed(Tamagochi tamagochi);

    void play(Tamagochi tamagochi);

    void sleep(Tamagochi tamagochi);

    void tikTak(Tamagochi tamagochi);
}
