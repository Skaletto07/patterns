package patterns.template.ex1;

public class Tea {
    public void make() {
        System.out.println("pour tea");
        boilWater();
        System.out.println("waiting for it to boil");
        System.out.println("pour into cups");
    }

    protected void boilWater() {

    }
}
