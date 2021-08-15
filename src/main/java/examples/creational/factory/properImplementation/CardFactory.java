package examples.creational.factory.properImplementation;

public class CardFactory {

    public static Card getCard(CARD_TYPE cardType) {
        switch (cardType) {
            case BANK_CARD: {
                return new BankCard();
            }

            case GREETING_CARD: {
                return new GreetingCard();
            }

            default: {
                return null;
            }
        }
    }

    public enum CARD_TYPE {
        BANK_CARD,
        GREETING_CARD
    }
}
