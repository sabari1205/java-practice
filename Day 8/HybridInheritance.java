interface HybridEngine {
    void start();
}

interface HybridWheels {
    void rotate();
}

class HybridVehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class HybridCar extends HybridVehicle implements HybridEngine, HybridWheels {
    public void start() {
        System.out.println("Car engine started");
    }
    
    public void rotate() {
        System.out.println("Car wheels are rotating");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        HybridCar myCar = new HybridCar();
        myCar.move();
        myCar.start();
        myCar.rotate();
    }
}
