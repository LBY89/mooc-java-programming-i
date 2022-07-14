public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int bookPages, int bookPublicationYear) {
        this.title = bookTitle;
        this.pages = bookPages;
        this.publicationYear = bookPublicationYear;
    }

    public String getName() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }


    
}
