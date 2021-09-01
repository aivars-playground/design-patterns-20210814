package examples.creational.abstractfactory.sample;

public abstract class DocumentFactory {

    public static DocumentFactory getCreditCardFactory(DocType docType) {
        switch(docType) {
            case JSON:
                return new JsonFactory();
            case HTML:
                return new XmlFactory();
        }
    }

    public enum DocType {
        JSON,
        HTML,
    }
}
