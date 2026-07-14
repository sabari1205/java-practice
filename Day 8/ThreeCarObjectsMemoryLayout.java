public class ThreeCarObjectsMemoryLayout {
    public static void main(String[] args) {
        System.out.println("=== Three Car Objects Memory Layout Explanation ===");
        System.out.println("When we instantiate three Car objects:");
        System.out.println(" - The 3 reference variables (car1, car2, car3) are created on the STACK memory.");
        System.out.println(" - The 3 actual Car object instances are allocated independently in the HEAP memory.");
        System.out.println(" - Any static fields are stored in the METHOD AREA (shared by all instances).\n");

        CarMemory car1 = new CarMemory("Toyota Camry", "Silver", 25000);
        CarMemory car2 = new CarMemory("Honda Accord", "Black", 27000);
        CarMemory car3 = new CarMemory("Ford Mustang", "Red", 45000);

        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        System.out.println("\n--- Detailed Layout ---");
        System.out.println("Stack [car1] -> Heap Address 0x001 [model=Camry, color=Silver, price=25000]");
        System.out.println("Stack [car2] -> Heap Address 0x002 [model=Accord, color=Black, price=27000]");
        System.out.println("Stack [car3] -> Heap Address 0x003 [model=Mustang, color=Red, price=45000]");
    }
}

class CarMemory {
    public static final int WHEELS = 4; // Method Area
    private String model; // Heap Memory
    private String color; // Heap Memory
    private double price; // Heap Memory

    public CarMemory(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void displayInfo() {
        System.out.printf("Model: %-15s | Color: %-8s | Price: $%-8.2f | Wheels: %d%n", model, color, price, WHEELS);
    }
}
