public class AreaOfCircle {
    public static void main(String[] args) {
        double radius = 7.5;
        double area = Math.PI * radius * radius;
        
        System.out.println("=== Area of Circle Calculation ===");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", area);
    }
}
