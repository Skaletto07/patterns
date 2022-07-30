package patterns.observer.ex1;

public class Main {
    public static void main(String[] args) {
        IObservable observable = new ConcreteObservable();

        IObserver observer1 = new ConcreteObserver("Misha");
        IObserver observer2 = new ConcreteObserver("Dima");
        IObserver observer3 = new ConcreteObserver("Tolya");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        pause();

        observable.notifyObserver();

    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
