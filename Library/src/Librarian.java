public interface Librarian {
    String identifyName();

    //Заказывает книги
    void orderBook(Book book, Supplier supplier);
}
