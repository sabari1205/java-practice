public class LaptopParameterizedConstructor {
    public static void main(String[] args) {
        System.out.println("=== Laptop Parameterized Constructor Demo ===");
        LaptopParam l1 = new LaptopParam("Apple MacBook Pro", "M3 Max", 36, 2499.00);
        LaptopParam l2 = new LaptopParam("Lenovo ThinkPad X1", "Intel i7", 16, 1499.00);

        l1.display();
        l2.display();
    }
}

class LaptopParam {
    private String brandModel;
    private String processor;
    private int ramGB;
    private double price;

    // Parameterized Constructor
    public LaptopParam(String brandModel, String processor, int ramGB, double price) {
        this.brandModel = brandModel;
        this.processor = processor;
        this.ramGB = ramGB;
        this.price = price;
    }

    public void display() {
        System.out.printf("Laptop: %-20s | CPU: %-10s | RAM: %2d GB | Price: $%.2f%n", brandModel, processor, ramGB, price);
    }
}
