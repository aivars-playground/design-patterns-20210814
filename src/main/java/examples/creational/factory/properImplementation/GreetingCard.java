package examples.creational.factory.properImplementation;

public class GreetingCard extends Card {

    @Override
    public void createCard() {
        fields.add("TITLE");
        fields.add("CONTENT");
    }
}
