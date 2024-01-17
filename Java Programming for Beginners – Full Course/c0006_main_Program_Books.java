public class c0006_main_Program_Books {
    public static void main(String[] args) {
        c0004_audio_books audiobooks1 = new c0004_audio_books("God book 3", "Vimal Kumar Mishra 3", 600, 5000);
        c0005_ebooks ebooks1 = new c0005_ebooks("God book 4", "Vimal Kumar Mishra 4", 500, "PDF");
        System.out.println(audiobooks1.toString());
        System.out.println(ebooks1.toString());
    }
}
