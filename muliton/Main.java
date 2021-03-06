package patterns.muliton;

public class Main {
    public static void main(String[] args) {

        Multiton multiton = Multiton.getInstance(Multiton.Count.ZERO);
        System.out.println(multiton);

        Multiton multiton2 = Multiton.getInstance(Multiton.Count.TWO);
        System.out.println(multiton2);

        MultitonSynchronized multitonSynchronized = MultitonSynchronized.getInstance(MultitonSynchronized.Count.ZERO);
        System.out.println(multitonSynchronized);

        MultitonSynchronized multitonSynchronized1 = MultitonSynchronized.getInstance(MultitonSynchronized.Count.ONE);
        System.out.println(multitonSynchronized1);
    }
}
