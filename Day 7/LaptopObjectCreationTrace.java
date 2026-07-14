public class LaptopObjectCreationTrace {
    public static void main(String[] args) {
        System.out.println("=== Tracing Laptop Object Creation Process ===");
        System.out.println("Step 1: Reference variable 'myLaptop' created on the Stack.");
        System.out.println("Step 2: 'new Laptop(...)' allocates memory on the Heap for all instance variables with default values (0, null, etc.).");
        System.out.println("Step 3: Laptop constructor executes, initializing fields with provided values.");
        System.out.println("Step 4: The memory address (reference) on Heap is assigned to 'myLaptop' on Stack.\n");

        Laptop myLaptop = new Laptop("Dell XPS 15", 32, 1800.00);
        myLaptop.displaySpecs();
    }
}

class Laptop {
    private String model;
    private int ramGB;
    private double price;

    public Laptop(String model, int ramGB, double price) {
        System.out.println("[Constructor Executing] Initializing fields for: " + model);
        this.model = model;
        this.ramGB = ramGB;
        this.price = price;
    }

    public void displaySpecs() {
        System.out.println("--- Laptop Specs ---");
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramGB + " GB");
        System.out.printf("Price: $%.2f%n", price);
    }
}
