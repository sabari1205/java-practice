public class CalculatorCode {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }
    public static double modulus(double a, double b) { return a % b; }

    public static void main(String[] args) {
        double num1 = 45.5;
        double num2 = 10.0;

        System.out.println("=== General Calculator Code Demo ===");
        System.out.println("Operands: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println("Modulus: " + modulus(num1, num2));
    }
}
