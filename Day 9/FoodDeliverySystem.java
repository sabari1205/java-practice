import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        System.out.println("=== Food Delivery System Demo (Inheritance, Composition, Polymorphism) ===");
        
        FoodOrder order = new FoodOrder("ORD-7712", new DeliveryAddress("45 Elm St", "Apt 3B", "Springfield"));
        order.addItem(new FoodItem("Margherita Pizza", 14.99));
        order.addItem(new FoodItem("Garlic Bread", 4.50));
        order.addItem(new FoodItem("Tiramisu", 6.50));

        DeliveryPartner[] partners = {
            new BikeDeliveryPartner("DP-1", "Jake", "Yamaha MT-15"),
            new DroneDeliveryPartner("DP-2", "SkyBot-X", 15.0)
        };

        order.displayOrder();

        System.out.println("\nAssigning delivery partners dynamically (Polymorphism):");
        for (DeliveryPartner dp : partners) {
            dp.deliverOrder(order.getOrderId());
        }
    }
}

class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

class DeliveryAddress {
    private String street;
    private String apartment;
    private String city;

    public DeliveryAddress(String street, String apartment, String city) {
        this.street = street;
        this.apartment = apartment;
        this.city = city;
    }

    public String getFullAddress() { return street + ", " + apartment + ", " + city; }
}

class FoodOrder {
    private String orderId;
    private DeliveryAddress address; // Composition: Order owns address
    private List<FoodItem> items;    // Composition: Order owns food items

    public FoodOrder(String orderId, DeliveryAddress address) {
        this.orderId = orderId;
        this.address = address;
        this.items = new ArrayList<>();
    }

    public String getOrderId() { return orderId; }

    public void addItem(FoodItem item) { items.add(item); }

    public double calculateTotal() {
        double total = 0;
        for (FoodItem item : items) total += item.getPrice();
        return total;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Delivery To: " + address.getFullAddress());
        System.out.println("Items:");
        for (FoodItem item : items) {
            System.out.printf("  * %-20s : $%.2f%n", item.getName(), item.getPrice());
        }
        System.out.printf("Total Payable: $%.2f%n", calculateTotal());
    }
}

abstract class DeliveryPartner {
    protected String partnerId;
    protected String name;

    public DeliveryPartner(String partnerId, String name) {
        this.partnerId = partnerId;
        this.name = name;
    }

    public abstract void deliverOrder(String orderId);
}

class BikeDeliveryPartner extends DeliveryPartner {
    private String bikeModel;

    public BikeDeliveryPartner(String partnerId, String name, String bikeModel) {
        super(partnerId, name);
        this.bikeModel = bikeModel;
    }

    @Override
    public void deliverOrder(String orderId) {
        System.out.printf("[Bike Delivery] %s is speeding through city traffic on %s to deliver order %s.%n", name, bikeModel, orderId);
    }
}

class DroneDeliveryPartner extends DeliveryPartner {
    private double maxAltitudeMeters;

    public DroneDeliveryPartner(String partnerId, String name, double maxAltitudeMeters) {
        super(partnerId, name);
        this.maxAltitudeMeters = maxAltitudeMeters;
    }

    @Override
    public void deliverOrder(String orderId) {
        System.out.printf("[Drone Delivery] Autonomous drone %s is flying at %.1f meters to drop off order %s.%n", name, maxAltitudeMeters, orderId);
    }
}
