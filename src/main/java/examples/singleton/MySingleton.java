package examples.singleton;

//singleton should not be static class (thread safety)
public class MySingleton {

    private static MySingleton instance = new MySingleton();

    private MySingleton() {}

    public static MySingleton getInstance() {
        return instance;
    }

}
