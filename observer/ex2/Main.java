package patterns.observer.ex2;

public class Main {
    public static void main(String[] args) {
     Stock stock = new Stock();

     IObserver broker1 = new Broker(stock, "Misha");
     IObserver broker2 = new Broker(stock, "Dima");
     IObserver broker3 = new Broker(stock, "Tolya");

     pause();

     stock.setRate();

        pause();
        stock.setRate();

        pause();
        stock.setRate();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
