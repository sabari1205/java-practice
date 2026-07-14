class LibraryBook {
    String title;
    String author;

    LibraryBook() {
        title = "Unknown";
        author = "Unknown";
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook();
        b.display();
    }
}
