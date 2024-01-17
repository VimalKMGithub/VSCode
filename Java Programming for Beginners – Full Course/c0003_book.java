public class c0003_book {

    private String title;
    private String author;
    private int pageCount;

    c0003_book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String toString() {
        return String.format("%s by %s, Pages - %d", this.title, this.author, this.pageCount);
    }

}
