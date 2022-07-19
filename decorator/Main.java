package patterns.decorator;

import patterns.decorator.cake.Baking;
import patterns.decorator.cake.Cake;
import patterns.decorator.cake.Chocolate;
import patterns.decorator.cake.Cream;
import patterns.decorator.io.ShuffleCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Baking baking = new Cake();
        baking.about();
        baking = new Cream(baking);
        baking.about();
        baking = new Chocolate(baking);
        baking.about();
        baking = new Chocolate(baking);
        baking.about();
        Baking baking1 = new Chocolate(new Cream(new Chocolate(new Cream(new Chocolate(new Cake())))));
        baking1.about();


        int c;
        try (InputStream inputStream = new ShuffleCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));) {
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {

        }


    }
}
