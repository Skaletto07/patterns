package patterns.State.ex1;

public class Fan {
    private State state;
    private int tempState;

    public Fan() {
        state = OffState.getInstance();
    }

    public void push() {
        state.push(this);
    }

    public void setState(State state) {
        this.state = state;
    }

}
