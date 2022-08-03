package patterns.strategy.ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>(List.of(new Cat("Murka"), new Cat("Barsik"), new Cat("Zebra")));

        System.out.println(catList);
        List<Cat> collect = catList.stream().sorted(Comparator.comparing(Cat::getName)).toList();
        System.out.println(collect);
        catList.sort(Comparator.comparing(Cat::getName));
        System.out.println(catList);
    }
}
