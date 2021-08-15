package examples.creational.builder;

public class BuilderDemo {

    //not good idea - mixing builder and javabean
    //better - use builder to create immutable classes

    public static void main(String[] args) {
        simpleBuilder();
    }

    private static void simpleBuilder() {

        var sandwichBuilder = new SandwichWithBuilder.Builder("no bread");
        sandwichBuilder
                .sauce("mustard")
                .filling("chickpea");

        var sandwich1 = sandwichBuilder.build();

        System.out.println("got sandwich:{}"+sandwich1);

    }
}
