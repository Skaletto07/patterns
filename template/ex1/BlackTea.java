package patterns.template.ex1;

public class BlackTea extends Tea {

    @Override
    protected void boilWater() {
        System.out.println("heat the water to 100 degree");
    }
}
