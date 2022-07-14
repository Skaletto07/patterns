package patterns.muliton;

import java.util.HashMap;
import java.util.Map;

public class MultitonSynchronized {

    private MultitonSynchronized() {
    }

    public static enum Count{
        ZERO,
        ONE,
        TWO
    }

    private static MultitonSynchronized instance;

    private static Map<Count, MultitonSynchronized> synchronizedMap = new HashMap<>();

    public static MultitonSynchronized getInstance(Count key) {
            instance = synchronizedMap.get(key);
            MultitonSynchronized localInstance = instance;
            if (localInstance == null) {
                synchronized (MultitonSynchronized.class) {
                    localInstance = instance;
                    if (localInstance == null) {
                        instance = localInstance = new MultitonSynchronized();
                        synchronizedMap.put(key, localInstance);
                    }
                }
            }
        return localInstance;
    }

}
