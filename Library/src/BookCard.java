import java.util.Calendar;

public class BookCard {

    private Book nameOfBook;
    private Calendar dateTakingBook;

    public BookCard(Book nameOfBook, Calendar takingBook) {
        this.nameOfBook = nameOfBook;
        this.dateTakingBook = takingBook;
        setDateTaking(takingBook);
    }

    public void setDateTaking(Calendar date) {
        dateTakingBook = date;
    }

    public Calendar getDateTaking() {
        return this.dateTakingBook;
    }

    public static boolean checkRentalDays(Calendar calendar) {
        calendar.add(Calendar.DATE, 14);
        System.out.println(calendar.get(Calendar.DATE));
        return true;
    }
}
