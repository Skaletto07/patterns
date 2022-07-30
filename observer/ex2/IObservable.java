package patterns.observer.ex2;

public interface IObservable {
    void addObserver(IObserver observer);

    void deleteObserver(IObserver observer);

    void notifyObserver();

}
