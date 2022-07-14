package patterns.muliton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    public static enum Count{
        ZERO,
        ONE,
        TWO,
        THREE
    }

    private Multiton() {
    }

    private static Map<Count, Multiton> multitonMap = new HashMap();

    private static Multiton instance;

    public static Multiton getInstance(Count key) {
        instance = multitonMap.get(key);
        if (instance == null) {
            instance = new Multiton();
            multitonMap.put(key, instance);
        }
        return instance;
    }

}
