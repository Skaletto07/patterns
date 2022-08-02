package patterns.muliton.composite.ex2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Buckwheat", 100);
        Product product2 = new Product("Rice", 110);
        Product product3 = new Product("Oatmeal", 30);
        Product product4 = new Product("Pearl barley", 40);
        Product product5 = new Product("Pearl barley especial", 50);

        Box box1 = new Box("Packet1");

        box1.addComponent(product);
        box1.addComponent(product2);

        Box box2 = new Box("Packet2");
        box2.addComponent(product3);
        box2.addComponent(product4);

        Box box3 = new Box("Packet3");
        box3.addComponent(box1);
        box3.addComponent(box2);
        box3.addComponent(product5);

        System.out.println(product.getPrice());
        System.out.println(product.getContent());
        System.out.println(product2.getPrice());
        System.out.println(product2.getContent());
        System.out.println(product3.getPrice());
        System.out.println(product3.getContent());
        System.out.println(product4.getPrice());
        System.out.println(product4.getContent());
        System.out.println(product5.getPrice());
        System.out.println(product5.getContent());
        System.out.println();
        System.out.println(box1.getContent());
        System.out.println(box1.getPrice());
        System.out.println();
        System.out.println(box2.getContent());
        System.out.println(box2.getPrice());
        System.out.println();
        System.out.println(box3.getContent());
        System.out.println(box3.getPrice());
    }
}
