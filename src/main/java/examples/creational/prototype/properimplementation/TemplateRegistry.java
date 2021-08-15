package examples.creational.prototype.properimplementation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class TemplateRegistry {

    public enum MEDIA_TYPE {
        BOOK,
        MOVIE
    }

    private Map<MEDIA_TYPE, Item> templates = new HashMap<>();

    public TemplateRegistry() {
        loadTemplates();
    }

    public Item createItem(MEDIA_TYPE mediaType) {
        Item item = null;

        try {
            item = (Item)(templates.get(mediaType)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadTemplates() {
        Movie movie = new Movie();
        movie.setTitle("test movie");
        movie.setUri("localhost");
        movie.setPrice(-1);
        movie.setIsan("ISAN 0000-0000-0000-0000-A-0000-0000-A");
        movie.setRuntime(Duration.ofMillis(0));
        templates.put(MEDIA_TYPE.MOVIE, movie);

        Book book = new Book();
        book.setTitle("test book");
        book.setUri("localhost");
        book.setPrice(-1);
        book.setIsbn("000-0-00-000000-0");
        book.setPages(0);
        templates.put(MEDIA_TYPE.BOOK, book);
    }
}

