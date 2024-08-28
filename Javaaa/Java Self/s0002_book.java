public class s0002_book {
    private String title;
    private String author;
    private int pageCount;

    s0002_book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String toString() {
        return String.format("%s - %s, Pages : %d", this.title, this.author, this.pageCount);
    }
}