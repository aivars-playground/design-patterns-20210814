package examples.creational.prototype.properimplementation;

public class Book extends Item{

    //International Standard Book Number
    private String isbn;
    private int pages;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
