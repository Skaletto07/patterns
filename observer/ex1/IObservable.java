package patterns.observer.ex1;

public interface IObservable {
    void addObserver(IObserver observer);

    void deleteObserver(IObserver observer);

    void notifyObserver();

}
