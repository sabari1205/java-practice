public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rateOfInterest = 5.5; // in percentage
        double timeYears = 3.0;
        
        double simpleInterest = (principal * rateOfInterest * timeYears) / 100.0;
        double totalAmount = principal + simpleInterest;
        
        System.out.println("=== Simple Interest Calculation ===");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Time (Years): " + timeYears);
        System.out.printf("Simple Interest: $%.2f%n", simpleInterest);
        System.out.printf("Total Amount Payable: $%.2f%n", totalAmount);
    }
}
