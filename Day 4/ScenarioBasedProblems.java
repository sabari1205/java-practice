public class ScenarioBasedProblems {
    public static void main(String[] args) {
        System.out.println("=== Scenario-Based Problem: Electricity Bill Calculation ===");
        int[] sampleUnits = {50, 150, 350};
        for (int u : sampleUnits) {
            System.out.printf("Units Consumed: %d -> Total Bill: $%.2f%n", u, calculateElectricityBill(u));
        }
        
        System.out.println("\n=== Scenario-Based Problem: ATM Cash Withdrawal Logic ===");
        int[] withdrawalRequests = {130, 85, 500};
        for (int w : withdrawalRequests) {
            System.out.println("Requesting $" + w + ": " + atmWithdrawal(w));
        }
    }

    public static double calculateElectricityBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            bill = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 3.50);
        }
        return bill + (bill * 0.05); // Include 5% tax
    }

    public static String atmWithdrawal(int amount) {
        if (amount % 10 != 0) {
            return "Error: Amount must be a multiple of $10.";
        }
        int hundreds = amount / 100;
        amount %= 100;
        int fifties = amount / 50;
        amount %= 50;
        int tens = amount / 10;
        
        return String.format("Dispensed: $100x%d, $50x%d, $10x%d", hundreds, fifties, tens);
    }
}
