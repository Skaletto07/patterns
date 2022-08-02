package patterns.State.ex2;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Tamagochi tamagochi = new Tamagochi();
        Random random = new Random();
         while (true) {
             if (random.nextInt(100) < 30) {
                 tamagochi.feed();
             }
             tamagochi.tikTak();
             Thread.sleep(10);
         }
    }
}
