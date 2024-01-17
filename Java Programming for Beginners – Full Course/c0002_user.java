import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class c0002_user {

    private String name;
    private LocalDate birthDay;
    private ArrayList<c0003_book> books = new ArrayList<c0003_book>();

    c0002_user(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName() {
        return this.name;
    }

    public String getbirthDay() {
        return this.birthDay.toString();
    }

    public String getBooksBorrowed() {
        return this.books.toString();
    }

    public void borrow(c0003_book bookBorrow) {
        this.books.add(bookBorrow);
    }

    public int age() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }
}
