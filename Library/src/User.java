import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class User implements Administrator, Reader, Librarian, Supplier {
    String userName;

    public User(String name) {
        this.userName = name;
    }

    @Override
    public String identifyName() {
        return this.userName;
    }

    @Override
    public BookCard takeBook(Book book, Administrator admin) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar(2022, 4, 13);
        BookCard bookCard = new BookCard(book, calendar);

        System.out.println(formater.format(calendar.getTime()) + ": Читатель " + this.identifyName()
                + " берет книгу " + book.getName() + " у администратора " + admin.identifyName());
        return bookCard;
    }

    @Override
    public BookCard returnBook(Book book, Administrator admin) {
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar(2022, 4, 26);
        BookCard bookCard = new BookCard(book, calendar);

        System.out.println(formater.format(calendar.getTime()) + ": Читатель " + this.identifyName()
                + " возвращает книгу " + book.getName() + " администратору " + admin.identifyName());
        return bookCard;
    }

    @Override
    public void findBook(Book book) {
        System.out.println("Администратор " + this.identifyName() + " ищет книгу " + book.getName());
    }

    @Override
    public void issueBook(Book book, Reader reader) {
        System.out.println("Администратор " + this.identifyName() + " выдает книгу "
                + book.getName() + " читателю " + reader.identifyName());
    }

    @Override
    public void overdueNotification(Reader reader, BookCard bookCard) {
        //Сегодняшняя дата
        Calendar dateToday = new GregorianCalendar(2022, 4, 23);

        //Получение даты взятия книги и прибавления срока аренды книги - 14 дней
        Calendar date = bookCard.getDateTaking();
        date.add(Calendar.DATE, 14);

        //Форматирование даты
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");

        //Проверка книги на просрочку
        if (dateToday.after(date)) {
            System.out.println("Читатель " + reader.identifyName() + " просрочил время возврата книги");
        } else {
            System.out.println("Читателю " + reader.identifyName() + " необходимо сдать книгу не позднее "
                    + formater.format(date.getTime()));
        }
    }

    @Override
    public void orderBook(Book book, Supplier supplier) {
        System.out.println("Библиотекарь " + this.identifyName() + " запрашивает книгу "
                + book.getName() + " у поставщика " + supplier.identifyName());
    }

    @Override
    public void bringBook(Book book, Librarian librarian) {
        System.out.println("Поставщик " + this.identifyName() + " приносит книгу "
                + book.getName() + " в библиотеку по запросу " + librarian.identifyName());
    }
}
