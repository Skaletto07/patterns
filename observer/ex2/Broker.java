package patterns.observer.ex2;

import java.util.Random;

public class Broker implements IObserver {
    IObservable stock;
    String name;

    public Broker(IObservable stock, String name) {
        this.stock = stock;
        this.name = name;
        stock.addObserver(this);
    }

    public void stopTrade() {
        stock.deleteObserver(this);
        stock = null;
    }

    @Override
    public void update(Object o) {
        Stock.StockInfo stockInfo = (Stock.StockInfo) o;
        if (stockInfo.usd > 30 + new Random().nextInt(40)) {
            System.out.println(name + " broker sells " + stockInfo.usd);
        } else {
            System.out.println(name + " broker buys " + stockInfo.usd);

        }
    }
}
