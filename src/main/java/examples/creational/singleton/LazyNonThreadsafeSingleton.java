package examples.creational.singleton;

public class LazyNonThreadsafeSingleton {

    private static LazyNonThreadsafeSingleton instance;

    private LazyNonThreadsafeSingleton() {}

    public static LazyNonThreadsafeSingleton getInstance(int i) {
        System.out.println("requested i:"+i+ " instance:" + instance + " thread:" + Thread.currentThread());
        if (instance == null) {
            System.out.println(" \\null i:"+i+ " thread:" + Thread.currentThread());
            instance = new LazyNonThreadsafeSingleton();
            System.out.println(" \\- i:"+i+ " instance:" + instance + " thread:" + Thread.currentThread());
        }
        return instance;
    }

}