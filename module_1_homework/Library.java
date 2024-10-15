class Library {
    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();

    // Методы для управления книгами
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }

    // Методы для управления читателями
    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Reader registered: " + reader.getName());
    }

    public void removeReader(Reader reader) {
        readers.remove(reader);
        System.out.println("Reader removed: " + reader.getName());
    }

    // Выдача книги читателю
    public void issueBook(String isbn, Reader reader) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Issuing book to: " + reader.getName());
            book.issueBook();
        } else {
            System.out.println("Book not found (ISBN: " + isbn + ")");
        }
    }

    // Возврат книги в библиотеку
    public void returnBook(String isbn, Reader reader) {
        Book book = findBookByIsbn(isbn);
        if (book != null) {
            System.out.println("Returning book from: " + reader.getName());
            book.returnBook();
        } else {
            System.out.println("Book not found (ISBN: " + isbn + ")");
        }
    }

    // Поиск книги по ISBN
    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Вывод списка книг
    public void displayBooks() {
        System.out.println("\nBooks in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Вывод списка читателей
    public void displayReaders() {
        System.out.println("\nRegistered readers:");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }
}
