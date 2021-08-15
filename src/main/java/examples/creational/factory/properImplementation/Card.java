package examples.creational.factory.properImplementation;

import java.util.ArrayList;
import java.util.List;

public abstract class Card {

    protected List<String> fields = new ArrayList<>();

    protected Card() {
        createCard();
    }

    public abstract void createCard();

    public List<String> getFields() {
        return fields;
    }
}
