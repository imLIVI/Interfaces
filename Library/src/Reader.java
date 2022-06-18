public interface Reader {
    String identifyName();

    //Берет книги
    BookCard takeBook(Book book, Administrator admin);

    //Возвращает книги
    BookCard returnBook(Book book, Administrator admin);

}
