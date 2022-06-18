public interface Supplier {
    String identifyName();

    // Приносит книги в библиотеку
    void bringBook(Book book, Librarian librarian);
}
