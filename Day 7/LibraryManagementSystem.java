import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Library Management System Demo ===");
        Library lib = new Library("City Central Library");

        LibraryBook b1 = new LibraryBook("ISBN-101", "Clean Code", "Robert C. Martin");
        LibraryBook b2 = new LibraryBook("ISBN-102", "Design Patterns", "GoF");
        LibraryBook b3 = new LibraryBook("ISBN-103", "Java Concurrency in Practice", "Brian Goetz");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.displayCatalog();

        lib.borrowBook("ISBN-102");
        lib.borrowBook("ISBN-102");
        lib.returnBook("ISBN-102");
        lib.displayCatalog();
    }
}

class LibraryBook {
    private String isbn;
    private String title;
    private String author;
    private boolean isIssued;

    public LibraryBook(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }
}

class Library {
    private String libraryName;
    private List<LibraryBook> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(LibraryBook book) {
        books.add(book);
        System.out.println("[Library] Added Book: " + book.getTitle());
    }

    public void borrowBook(String isbn) {
        for (LibraryBook book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("[Borrow] Successfully borrowed: " + book.getTitle());
                } else {
                    System.out.println("[Borrow Failed] Book already issued: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("[Borrow Failed] Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (LibraryBook book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("[Return] Successfully returned: " + book.getTitle());
                } else {
                    System.out.println("[Return Failed] Book was not issued: " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("[Return Failed] Book with ISBN " + isbn + " not found.");
    }

    public void displayCatalog() {
        System.out.println("\n--- Catalog for " + libraryName + " ---");
        for (LibraryBook book : books) {
            System.out.printf("ISBN: %-8s | Title: %-28s | Author: %-18s | Status: %s%n",
                    book.getIsbn(), book.getTitle(), book.getAuthor(), (book.isIssued() ? "ISSUED" : "AVAILABLE"));
        }
        System.out.println();
    }
}
