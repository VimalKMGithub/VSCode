public class s0002_ebooks extends s0002_book {
    private String bookFormat;

    s0002_ebooks(String title, String author, int pageCount, String bookFormat) {
        super(title, author, pageCount);
        this.bookFormat = bookFormat;
    }

    public String toString() {
        return String.format(super.toString() + ", Format : %s", this.bookFormat);
    }
}