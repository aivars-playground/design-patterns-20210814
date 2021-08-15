package examples.creational.singleton;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingletonDemo {

    public static void main(String[] args) {
        basicDemo();
        nonThreadsafeDemo();
        threadsafeDemo();
    }

    private static void threadsafeDemo() {
        LazyThreadsafeSingleton[] array = new LazyThreadsafeSingleton[20];
        IntStream
                .range(0, array.length)
                .parallel()
                .peek(i -> {
                    array[i] = LazyThreadsafeSingleton.getInstance();
                }).forEach(a -> {});
        System.out.println("Expecting 1, got:"+ Arrays.stream(array).collect(Collectors.toSet()).size());
    }

    private static void nonThreadsafeDemo() {
        LazyNonThreadsafeSingleton[] array = new LazyNonThreadsafeSingleton[20];
        IntStream
                .range(0, array.length)
                .parallel()
                .peek(i -> {
                    array[i] = LazyNonThreadsafeSingleton.getInstance(i);
                }).forEach(a -> {});
        System.out.println("Expecting 1, got:"+ Arrays.stream(array).collect(Collectors.toSet()).size());
    }

    private static void basicDemo() {
        Runtime rt1 = Runtime.getRuntime();
        MySingleton ms1 = MySingleton.getInstance();
        NonSingleton non1 = NonSingleton.getInstance();
        System.out.println("==1:"+rt1+":"+ms1+":"+non1);

        Runtime.getRuntime().gc();

        Runtime rt2 = Runtime.getRuntime();
        MySingleton ms2 = MySingleton.getInstance();
        NonSingleton non2 = NonSingleton.getInstance();
        System.out.println("==2:"+rt2+":"+ms2+":"+non2);
    }
}
