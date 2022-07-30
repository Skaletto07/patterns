package patterns.observer.ex1;

import java.util.ArrayList;

public class ConcreteObservable implements IObservable {

    ArrayList<IObserver> observers = new ArrayList<>();


    @Override
    public void addObserver(IObserver iObserver) {
        observers.add(iObserver);
    }

    @Override
    public void deleteObserver(IObserver iObserver) {
        observers.remove(iObserver);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
