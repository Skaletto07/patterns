package patterns.State.ex1;

public class HighState implements State {

    private static volatile HighState instance;

    private HighState() {}

    public static HighState getInstance() {
        HighState localInstance = instance;
        if (localInstance == null) {
            localInstance = instance;
            synchronized (HighState.class) {
                if (localInstance == null) {
                    instance = localInstance = new HighState();
                }
            }
        }
        return localInstance;
    }

    @Override
    public void push(Fan fan) {
        System.out.println("Off...");
        fan.setState(OffState.getInstance());
    }
}
