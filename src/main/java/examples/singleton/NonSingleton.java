package examples.singleton;

public class NonSingleton {

    private NonSingleton(){}

    public static NonSingleton getInstance() {
        return new NonSingleton();
    }
}
