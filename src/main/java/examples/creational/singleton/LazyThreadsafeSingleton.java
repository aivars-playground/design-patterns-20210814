package examples.creational.singleton;

public class LazyThreadsafeSingleton {

    //volatile - stores in main memory, not cpu cache
    private static volatile LazyThreadsafeSingleton instance = null;

    private LazyThreadsafeSingleton() {
        if (instance != null) {
            throw new RuntimeException("use getInstance() instead");
        }
    }

    public static LazyThreadsafeSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyThreadsafeSingleton.class) {
                if (instance == null) {
                    instance = new LazyThreadsafeSingleton();
                }
            }
        }

        return instance;
    }

}