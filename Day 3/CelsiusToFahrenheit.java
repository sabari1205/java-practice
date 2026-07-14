public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double[] celsiusValues = {0.0, 25.0, 37.0, 100.0, -40.0};
        
        System.out.println("=== Celsius to Fahrenheit Conversion Table ===");
        System.out.printf("%-15s | %-15s%n", "Celsius (°C)", "Fahrenheit (°F)");
        System.out.println("----------------------------------------");
        
        for (double c : celsiusValues) {
            double f = (c * 9.0 / 5.0) + 32.0;
            System.out.printf("%-15.2f | %-15.2f%n", c, f);
        }
    }
}
