package patterns.template.ex1;

public class GreenTea extends Tea {

    @Override
    protected void boilWater() {
        System.out.println("heat the water to 85 degree");
    }
}
