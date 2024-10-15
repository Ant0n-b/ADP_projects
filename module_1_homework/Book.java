import java.util.ArrayList;
import java.util.List;

// Класс Book (Книга)
class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies;

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopies() {
        return copies;
    }

    public void issueBook() {
        if (copies > 0) {
            copies--;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("No copies available for: " + title);
        }
    }

    public void returnBook() {
        copies++;
        System.out.println("Book returned: " + title);
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + "), Copies: " + copies;
    }
}