public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rateOfInterest = 5.5; // percentage
        double timeYears = 3.0;
        int compoundingFrequency = 4; // Quarterly compounding
        
        // CI Formula: A = P * (1 + r/n)^(n*t)
        double amount = principal * Math.pow(1 + (rateOfInterest / 100.0) / compoundingFrequency, compoundingFrequency * timeYears);
        double compoundInterest = amount - principal;
        
        System.out.println("=== Compound Interest Calculation ===");
        System.out.println("Principal: $" + principal);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Time (Years): " + timeYears);
        System.out.println("Compounding Frequency per year: " + compoundingFrequency);
        System.out.printf("Compound Interest: $%.2f%n", compoundInterest);
        System.out.printf("Total Amount: $%.2f%n", amount);
    }
}
