public class VehicleParentArrayDemo {
    public static void main(String[] args) {
        System.out.println("=== Storing Different Vehicle Objects inside a Parent Reference Array ===");
        
        ParentVehicle[] vehicles = {
            new CarVehicle("Tesla Model Y", 4),
            new TruckVehicle("Volvo FH16", 18, 25.0),
            new MotorcycleVehicle("Kawasaki Ninja", 200)
        };

        for (ParentVehicle v : vehicles) {
            v.displayInfo();
            v.move(); // Runtime polymorphism
            System.out.println("----------------------------------------");
        }
    }
}

abstract class ParentVehicle {
    protected String model;

    public ParentVehicle(String model) {
        this.model = model;
    }

    public abstract void move();
    public abstract void displayInfo();
}

class CarVehicle extends ParentVehicle {
    private int doors;

    public CarVehicle(String model, int doors) {
        super(model);
        this.doors = doors;
    }

    @Override
    public void move() { System.out.println(model + " is cruising on the highway."); }

    @Override
    public void displayInfo() { System.out.printf("[Car] Model: %-15s | Doors: %d%n", model, doors); }
}

class TruckVehicle extends ParentVehicle {
    private int wheels;
    private double payloadCapacityTons;

    public TruckVehicle(String model, int wheels, double payloadCapacityTons) {
        super(model);
        this.wheels = wheels;
        this.payloadCapacityTons = payloadCapacityTons;
    }

    @Override
    public void move() { System.out.println(model + " is hauling heavy cargo."); }

    @Override
    public void displayInfo() { System.out.printf("[Truck] Model: %-13s | Wheels: %d | Payload: %.1f tons%n", model, wheels, payloadCapacityTons); }
}

class MotorcycleVehicle extends ParentVehicle {
    private int topSpeed;

    public MotorcycleVehicle(String model, int topSpeed) {
        super(model);
        this.topSpeed = topSpeed;
    }

    @Override
    public void move() { System.out.println(model + " is weaving through traffic."); }

    @Override
    public void displayInfo() { System.out.printf("[Motorcycle] Model: %-10s | Top Speed: %d km/h%n", model, topSpeed); }
}
