public class VolumeOfCuboid {
    public static void main(String[] args) {
        double length = 12.0;
        double width = 8.5;
        double height = 5.0;
        
        double volume = length * width * height;
        
        System.out.println("=== Volume of Cuboid Calculation ===");
        System.out.println("Length: " + length + ", Width: " + width + ", Height: " + height);
        System.out.printf("Volume: %.2f%n", volume);
    }
}
