package examples.creational.factory.properImplementation;

public class BankCard extends Card{

    @Override
    public void createCard() {
        fields.add("PAN");
        fields.add("NAME");
    }
}
