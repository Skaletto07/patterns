package patterns.State.ex1;

public class LowState implements State {
    private static volatile LowState instance;

    private LowState() {}

    public static LowState getInstance() {
        LowState localInstance = instance;
        if (localInstance == null) {
            localInstance = instance;
            synchronized (LowState.class) {
                if (localInstance == null) {
                    instance = localInstance = new LowState();
                }
            }
        }
        return localInstance;
    }
    @Override
    public void push(Fan fan) {
        System.out.println("switch to medium speed");
        fan.setState(MediumState.getInstance());
    }
}
