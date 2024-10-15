public class LibraryManagementSystem {

    public static void main(String[] args) {
        // Создание библиотеки
        Library library = new Library();

        // Создание книг
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 5);
        Book book2 = new Book("1984", "George Orwell", "987654321", 3);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1122334455", 2);

        // Добавление книг в библиотеку
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Создание читателей
        Reader reader1 = new Reader("John Doe", 1);
        Reader reader2 = new Reader("Jane Smith", 2);

        // Регистрация читателей
        library.registerReader(reader1);
        library.registerReader(reader2);

        // Отображение книг и читателей
        library.displayBooks();
        library.displayReaders();

        // Выдача книг
        library.issueBook("123456789", reader1);
        library.issueBook("987654321", reader2);

        // Возврат книг
        library.returnBook("123456789", reader1);

        // Удаление книги и читателя
        library.removeBook(book3);
        library.removeReader(reader2);

        // Повторное отображение книг и читателей
        library.displayBooks();
        library.displayReaders();
    }
}