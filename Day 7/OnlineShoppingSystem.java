import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        System.out.println("=== Online Shopping System Demo ===");
        Product p1 = new Product("P101", "Wireless Mouse", 25.50);
        Product p2 = new Product("P102", "Mechanical Keyboard", 89.99);
        Product p3 = new Product("P103", "USB-C Hub", 35.00);

        Customer cust = new Customer("C501", "Emma Watson", "emma@example.com");

        Order order = new Order("ORD-9901", cust);
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        order.displayOrderSummary();
    }
}

class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Customer {
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}

class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void displayOrderSummary() {
        System.out.println("\n--- Order Summary ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Products Purchased:");
        for (Product p : products) {
            System.out.printf(" - %-20s : $%.2f%n", p.getName(), p.getPrice());
        }
        System.out.printf("Total Amount Payable: $%.2f%n", calculateTotal());
    }
}
