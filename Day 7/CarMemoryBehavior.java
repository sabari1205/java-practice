public class CarMemoryBehavior {
    public static void main(String[] args) {
        System.out.println("=== Memory Behavior of Reference Variables ===");

        // Case 1: Car c; 
        // Declares a reference variable 'c' on the Stack. In local scope, it is uninitialized and cannot be used until assigned.
        System.out.println("1. Car c; -> Variable declared on Stack, uninitialized. Accessing it triggers compile-time error.");

        // Case 2: Car c = null;
        Car cNull = null;
        System.out.println("2. Car c = null; -> Variable on Stack holds literal 'null' (points to no Heap address).");
        try {
            cNull.drive();
        } catch (NullPointerException e) {
            System.out.println("   [Expected Error] Accessing method on null reference throws: " + e.getClass().getSimpleName());
        }

        // Case 3: Car c = new Car();
        Car cObj = new Car("Tesla Model 3");
        System.out.println("3. Car c = new Car(); -> Allocates object memory on Heap and stores its Heap address in 'c' on Stack.");
        cObj.drive();
    }
}

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println("   -> Driving " + model + " smoothly!");
    }
}
