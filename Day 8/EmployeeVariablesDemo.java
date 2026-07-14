public class EmployeeVariablesDemo {
    public static void main(String[] args) {
        System.out.println("=== Illustrating Local, Instance, and Static Variables ===");
        System.out.println("Initial Company Employee Count (Static Variable): " + EmployeeVar.getEmployeeCount());

        EmployeeVar e1 = new EmployeeVar("Alice");
        e1.calculateNetSalary(5000.0, 500.0); // Uses local variables

        EmployeeVar e2 = new EmployeeVar("Bob");
        e2.calculateNetSalary(6000.0, 800.0);

        System.out.println("\nFinal Company Employee Count (Static Variable): " + EmployeeVar.getEmployeeCount());
    }
}

class EmployeeVar {
    // 1. Static Variable: Shared across all instances of the class (stored in Method Area / Metaspace)
    private static int employeeCount = 0;

    // 2. Instance Variable: Separate copy for each object instance (stored in Heap Memory)
    private int employeeId;
    private String name;

    public EmployeeVar(String name) {
        employeeCount++; // Increment static counter
        this.employeeId = employeeCount; // Assign to instance field
        this.name = name;
        System.out.println("[Constructor] Created Employee instance: " + this.name + " (ID: " + this.employeeId + ")");
    }

    public void calculateNetSalary(double baseSalary, double bonus) {
        // 3. Local Variables: Declared inside a method, stored on Stack, destroyed when method finishes
        double taxRate = 0.15; // Local variable
        double taxAmount = baseSalary * taxRate; // Local variable
        double netSalary = (baseSalary - taxAmount) + bonus; // Local variable

        System.out.printf(" -> [%s - ID %d] Base: $%.2f, Tax: $%.2f, Bonus: $%.2f | Net Pay: $%.2f%n",
                name, employeeId, baseSalary, taxAmount, bonus, netSalary);
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
