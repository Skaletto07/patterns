package patterns.observer.ex2;

import java.util.ArrayList;
import java.util.Random;

public class Stock implements IObservable {
    StockInfo stockInfo;

    ArrayList<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
    observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer : observers) {
            observer.update(stockInfo);
        }
    }

    static class StockInfo {
        public int usd;
        public int euro;
    }

    public Stock() {
        stockInfo = new StockInfo();
    }

    public void setRate() {
        Random random = new Random();
        stockInfo.euro = random.nextInt(50) + 70;
        stockInfo.usd = random.nextInt(50) + 50;
        notifyObserver();
    }
}
