package patterns.muliton.composite.ex2;

import java.util.ArrayList;
import java.util.List;

public class Box extends Component {
    List<Component> components;

    public Box(String name) {
        super(name);
        components = new ArrayList<>();
    }

    @Override
    void addComponent(Component component) {
        components.add(component);
    }

    @Override
    int getPrice() {
        int price = 0;
        for (Component component : components) {
            price += component.getPrice();
        }
        return price;
    }

    @Override
    String getContent() {
        StringBuilder res = new StringBuilder();
        for (Component component : components) {
            if (res.length() == 0) {
                res.append(name).append(": ");
            } else {
                res.append(", ");
            }
           res.append(component.getContent());
        }
        return res.toString();
    }
}
