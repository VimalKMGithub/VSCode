public class c0005_ebooks extends c0003_book {
    private String format;

    c0005_ebooks(String title, String author, int pageCount, String format) {
        super(title, author, pageCount);
        this.format = format;
    }

    public String toString() {
        return super.toString() + ", Format : " + this.format;
    }
}