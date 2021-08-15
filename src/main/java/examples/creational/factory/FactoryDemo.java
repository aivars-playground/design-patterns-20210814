package examples.creational.factory;

import examples.creational.factory.properImplementation.CardFactory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryDemo {

    public static void main(String[] args) {
        calDemo();
        cardDemo();
    }

    private static void cardDemo() {
        var card = CardFactory.getCard(CardFactory.CARD_TYPE.GREETING_CARD);
        System.out.println("--card:"+card+" fields:"+card.getFields());
    }

    private static void calDemo() {

        //getting default calendar, default timezone
        Calendar cal = Calendar.getInstance();
        System.out.println("cal--"+cal.getTimeZone());

        //Uk calendar... not different...
        Calendar calForLocale = Calendar.getInstance(Locale.UK);
        System.out.println("eng--"+calForLocale.getTimeZone());

    }
}
