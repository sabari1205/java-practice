import java.util.ArrayList;
import java.util.List;

public class BookStoreApplication {
    public static void main(String[] args) {
        System.out.println("=== BookStore Application Using Constructors ===");
        BookStore store = new BookStore("Tech Knowledge Books", "Downtown Avenue");

        store.addBook(new StoreBook("B1", "Java Concurrency", "Brian Goetz", 45.99, 10));
        store.addBook(new StoreBook("B2", "Spring Boot in Action", "Craig Walls", 39.99, 5));
        store.addBook(new StoreBook("B3", "Clean Architecture", "Robert Martin", 34.50, 8));

        store.displayInventory();
        store.sellBook("B2", 2);
        store.sellBook("B2", 10); // Attempt to buy more than stock
        store.displayInventory();
    }
}

class StoreBook {
    private String id;
    private String title;
    private String author;
    private double price;
    private int stock;

    public StoreBook(String id, String title, String author, double price, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.printf("[%s] %-22s by %-15s | Price: $%-6.2f | Stock: %2d%n", id, title, author, price, stock);
    }
}

class BookStore {
    private String name;
    private String address;
    private List<StoreBook> inventory;

    public BookStore(String name, String address) {
        this.name = name;
        this.address = address;
        this.inventory = new ArrayList<>();
    }

    public void addBook(StoreBook book) {
        inventory.add(book);
        System.out.println("[Store] Added to inventory: " + book.getTitle());
    }

    public void sellBook(String bookId, int quantity) {
        for (StoreBook book : inventory) {
            if (book.getId().equals(bookId)) {
                if (book.reduceStock(quantity)) {
                    System.out.printf("[Sale] Sold %d copy/copies of '%s' for $%.2f%n", quantity, book.getTitle(), (quantity * book.getPrice()));
                } else {
                    System.out.printf("[Sale Failed] Insufficient stock for '%s' (Requested: %d, Available: %d)%n", book.getTitle(), quantity, book.getStock());
                }
                return;
            }
        }
        System.out.println("[Sale Failed] Book ID not found.");
    }

    public void displayInventory() {
        System.out.println("\n--- Inventory of " + name + " (" + address + ") ---");
        for (StoreBook book : inventory) {
            book.display();
        }
        System.out.println();
    }
}
