package patterns.singleton;

public class Water {
    private static volatile Water instance;

    private Water() {}

    public static Water getInstance() {
       Water localInstance = instance;
       if (localInstance == null) {
           synchronized (Water.class) {
               localInstance = instance;
               if (localInstance == null) {
                   instance = localInstance = new Water();
               }
           }
       }
       return localInstance;
    }
}
