public class c0004_audio_books extends c0003_book {

    private int runTime;

    c0004_audio_books(String title, String author, int pageCount, int runTime) {
        super(title, author, pageCount);
        this.runTime = runTime;
    }

    public String toString() {
        return super.toString() + ", Runtime : " + this.runTime;
    }
}
