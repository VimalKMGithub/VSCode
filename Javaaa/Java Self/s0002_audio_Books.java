public class s0002_audio_Books extends s0002_book {
    private int runTime;

    s0002_audio_Books(String title, String author, int pageCount, int runTime) {
        super(title, author, pageCount);
        this.runTime = runTime;
    }

    public String toString() {
        return String.format(super.toString() + ", Runtime : %d minutes", this.runTime);
    }
}