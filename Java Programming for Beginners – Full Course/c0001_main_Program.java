public class c0001_main_Program {
    public static void main(String[] args) {

        c0002_user user1 = new c0002_user("Vimal Kumar Mishra Junior", "2003-08-28");

        c0003_book book1 = new c0003_book("God book", "Jai ho Vimal", 250);
        c0003_book book2 = new c0003_book("God book 2", "Jai ho Vimal 2", 300);

        user1.borrow(book1);
        user1.borrow(book2);

        System.out.printf("%s was born back in %s & he is now %d years old.\n", user1.getName(),
                user1.getbirthDay(), user1.age());
        System.out.printf("%s has borrowed these books: %s", user1.getName(), user1.getBooksBorrowed());

    }
}
