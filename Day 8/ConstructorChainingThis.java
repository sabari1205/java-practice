public class ConstructorChainingThis {
    public static void main(String[] args) {
        System.out.println("=== Constructor Chaining using this() Demo ===");
        System.out.println("1. Instantiating with no parameters:");
        Box b1 = new Box();
        b1.display();

        System.out.println("\n2. Instantiating with a single side (Cube):");
        Box b2 = new Box(5.0);
        b2.display();

        System.out.println("\n3. Instantiating with all dimensions (Cuboid):");
        Box b3 = new Box(10.0, 4.0, 6.0);
        b3.display();
    }
}

class Box {
    private double length;
    private double width;
    private double height;

    // No-arg constructor chains to 1-arg constructor
    public Box() {
        this(1.0); // calls Box(double side)
        System.out.println("[No-arg Constructor] Defaulted to unit cube.");
    }

    // 1-arg constructor chains to 3-arg constructor
    public Box(double side) {
        this(side, side, side); // calls Box(double length, double width, double height)
        System.out.println("[1-arg Constructor] Configured as cube with side = " + side);
    }

    // Master constructor where actual initialization happens
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("[3-arg Master Constructor] Dimensions initialized.");
    }

    public void display() {
        System.out.printf("Box Dimensions -> L: %.1f, W: %.1f, H: %.1f | Volume: %.2f%n", length, width, height, (length * width * height));
    }
}
