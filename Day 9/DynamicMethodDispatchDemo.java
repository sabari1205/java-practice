public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        System.out.println("=== Dynamic Method Dispatch (Runtime Polymorphism) Demo ===");
        
        // Superclass reference variable
        DispatchShape shape;

        shape = new DispatchCircle(5.0);
        // At runtime, JVM checks actual object type in Heap (DispatchCircle) and calls its draw() & area()
        shape.draw();
        System.out.printf("Computed Area: %.2f%n%n", shape.computeArea());

        shape = new DispatchRectangle(10.0, 4.0);
        // At runtime, JVM dynamically dispatches method call to DispatchRectangle
        shape.draw();
        System.out.printf("Computed Area: %.2f%n%n", shape.computeArea());

        shape = new DispatchTriangle(8.0, 6.0);
        // At runtime, JVM dynamically dispatches method call to DispatchTriangle
        shape.draw();
        System.out.printf("Computed Area: %.2f%n", shape.computeArea());
    }
}

abstract class DispatchShape {
    public abstract void draw();
    public abstract double computeArea();
}

class DispatchCircle extends DispatchShape {
    private double radius;
    public DispatchCircle(double radius) { this.radius = radius; }

    @Override
    public void draw() { System.out.println("[Dynamic Dispatch] Drawing a Circle with radius " + radius); }

    @Override
    public double computeArea() { return Math.PI * radius * radius; }
}

class DispatchRectangle extends DispatchShape {
    private double length, width;
    public DispatchRectangle(double length, double width) { this.length = length; this.width = width; }

    @Override
    public void draw() { System.out.println("[Dynamic Dispatch] Drawing a Rectangle (" + length + " x " + width + ")"); }

    @Override
    public double computeArea() { return length * width; }
}

class DispatchTriangle extends DispatchShape {
    private double base, height;
    public DispatchTriangle(double base, double height) { this.base = base; this.height = height; }

    @Override
    public void draw() { System.out.println("[Dynamic Dispatch] Drawing a Triangle (Base: " + base + ", Height: " + height + ")"); }

    @Override
    public double computeArea() { return 0.5 * base * height; }
}
