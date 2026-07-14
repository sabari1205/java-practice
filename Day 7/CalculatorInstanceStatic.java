public class CalculatorInstanceStatic {
    public static void main(String[] args) {
        System.out.println("=== 1. Static Methods Demo (Utility Calculator without state) ===");
        System.out.println("Static Add (10 + 5): " + StaticCalc.add(10, 5));
        System.out.println("Static Multiply (10 * 5): " + StaticCalc.multiply(10, 5));

        System.out.println("\n=== 2. Instance Methods Demo (Stateful Calculator with memory) ===");
        InstanceCalc calc = new InstanceCalc();
        calc.add(50);
        calc.subtract(15);
        calc.multiply(2);
        calc.displayMemory();
        calc.clear();
        calc.displayMemory();
    }
}

class StaticCalc {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : 0; }
}

class InstanceCalc {
    private double memory = 0.0;

    public void add(double val) {
        memory += val;
        System.out.println("[Instance] Added " + val + " -> Memory: " + memory);
    }

    public void subtract(double val) {
        memory -= val;
        System.out.println("[Instance] Subtracted " + val + " -> Memory: " + memory);
    }

    public void multiply(double val) {
        memory *= val;
        System.out.println("[Instance] Multiplied by " + val + " -> Memory: " + memory);
    }

    public void clear() {
        memory = 0.0;
        System.out.println("[Instance] Cleared Memory.");
    }

    public void displayMemory() {
        System.out.println("Current Memory Value: " + memory);
    }
}
