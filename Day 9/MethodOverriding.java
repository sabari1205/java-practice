class OverridingVehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class OverridingBike extends OverridingVehicle {
    void run() {
        System.out.println("Bike is running at 60 km/h in the road");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        OverridingVehicle v = new OverridingVehicle();
        v.run();

        OverridingBike b = new OverridingBike();
        b.run();
    }
}
