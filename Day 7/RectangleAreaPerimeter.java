public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        System.out.println("=== Rectangle Area & Perimeter Demo ===");
        Rectangle rect = new Rectangle(15.5, 8.0);
        rect.displayDetails();
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
    }
}
