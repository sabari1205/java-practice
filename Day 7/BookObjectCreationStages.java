public class BookObjectCreationStages {
    public static void main(String[] args) {
        System.out.println("=== Book Object Creation Stages ===");
        System.out.println("Main method started. About to instantiate Book...\n");
        
        Book myBook = new Book("Effective Java", "Joshua Bloch", 45.0);
        System.out.println("\nBook object successfully created and assigned to reference variable!");
        myBook.read();
    }
}

class Book {
    // Stage 1: Static initialization (happens once when class is loaded into JVM)
    static {
        System.out.println("[Stage 1: Class Loading] Book class loaded into JVM. Static block executed.");
    }

    // Stage 2: Instance variable declaration with default or explicit initial values
    private String title = "Untitled";
    private String author = "Unknown";
    private double price = 0.0;

    // Stage 3: Instance initialization block (runs before constructor)
    {
        System.out.println("[Stage 2 & 3: Memory Allocation & Initialization] Heap memory allocated for Book object. Default values assigned.");
    }

    // Stage 4: Constructor execution
    public Book(String title, String author, double price) {
        System.out.println("[Stage 4: Constructor Execution] Assigning parameters to instance fields.");
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void read() {
        System.out.printf("Reading '%s' by %s (Price: $%.2f)%n", title, author, price);
    }
}
