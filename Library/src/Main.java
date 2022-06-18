public class Main {

    public static void main(String[] args) {
        Book book = new Book("BookOne");

        Reader reader = new User("Reader");
        Librarian librarian = new User("Librarian");
        Supplier supplier = new User("Supplier");
        Administrator admin = new User("Admin");

        librarian.orderBook(book, supplier);
        supplier.bringBook(book, librarian);
        admin.findBook(book);
        admin.issueBook(book, reader);
        BookCard bookCard = reader.takeBook(book, admin);
        admin.overdueNotification(reader, bookCard);
        reader.returnBook(book, admin);

    }
}
