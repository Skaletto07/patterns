package patterns.State.ex1;

public class OffState implements State {
    private static volatile OffState instance;

    private OffState() {}

    public static OffState getInstance() {
    OffState localInstance = instance;
        if (localInstance == null) {
            synchronized (OffState.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new OffState();
                }
            }
        }
        return localInstance;
    }
    @Override
    public void push(Fan fan) {
        System.out.println("Low speed");
        fan.setState(LowState.getInstance());
    }
}
