package patterns.template.ex1;

public class Main {
    public static void main(String[] args) {
        Tea tea = new GreenTea();
        tea.make();

        Tea tea1 = new BlackTea();
        tea1.make();
    }
}
