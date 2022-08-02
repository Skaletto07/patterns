package patterns.State.ex1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Fan fan = new Fan();
    while (true) {
        fan.push();
        Thread.sleep(500);
    }


    }

}
