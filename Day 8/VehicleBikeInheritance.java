public class VehicleBikeInheritance {
    public static void main(String[] args) {
        System.out.println("=== Vehicle & Bike Inheritance Demo ===");
        Bike myBike = new Bike("Yamaha", 150, true);
        myBike.startEngine();
        myBike.displayBikeDetails();
        myBike.stopEngine();
    }
}

class Vehicle {
    protected String brand;
    protected int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        System.out.println("[Vehicle] " + brand + " engine started.");
    }

    public void stopEngine() {
        System.out.println("[Vehicle] " + brand + " engine stopped.");
    }
}

class Bike extends Vehicle {
    private boolean hasDiscBrake;

    public Bike(String brand, int maxSpeed, boolean hasDiscBrake) {
        super(brand, maxSpeed);
        this.hasDiscBrake = hasDiscBrake;
    }

    public void displayBikeDetails() {
        System.out.println("--- Bike Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Disc Brakes Equipped: " + (hasDiscBrake ? "Yes" : "No"));
    }
}
