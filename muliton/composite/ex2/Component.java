package patterns.muliton.composite.ex2;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    abstract int getPrice();

    abstract String getContent();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
