package patterns.State.ex1;

public class MediumState implements State {
    private static volatile MediumState instance;

    private MediumState() {}

    public static MediumState getInstance() {
        MediumState localInstance = instance;
        if(localInstance == null) {
            localInstance = instance;
            synchronized (MediumState.class) {
                if (localInstance == null) {
                    instance = localInstance = new MediumState();
                }
            }
        }
        return localInstance;

    }
    @Override
    public void push(Fan fan) {
        System.out.println("high state");
        fan.setState(HighState.getInstance());
    }
}
