public interface Administrator {
    String identifyName();

    // Находит книги
    void findBook(Book book);

    // Выдает книги
    void issueBook(Book book, Reader reader);

    // Уведомляет о просрочках времени возврата
    void overdueNotification(Reader reader, BookCard bookCard);
}
