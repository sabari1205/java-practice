public class EmployeeJvmMemoryLayout {
    public static void main(String[] args) {
        System.out.println("=== Employee Objects & JVM Memory Layout Explanation ===");
        System.out.println("1. Method Area (Metaspace): Stores class metadata, bytecode, and static variables (e.g., COMPANY_NAME).");
        System.out.println("2. Stack Memory: Stores local reference variables (e.g., emp1, emp2, emp3) and method execution frames.");
        System.out.println("3. Heap Memory: Stores the actual Employee object instances and their non-static instance fields (id, name, salary).\n");

        EmployeeMemory emp1 = new EmployeeMemory(101, "Alice", 75000.0);
        EmployeeMemory emp2 = new EmployeeMemory(102, "Bob", 82000.0);
        EmployeeMemory emp3 = new EmployeeMemory(103, "Charlie", 68000.0);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();

        System.out.println("\n[Memory Mapping Summary]");
        System.out.println(" - Stack: 'emp1' -> points to Heap Address A (id=101, name='Alice', salary=75000.0)");
        System.out.println(" - Stack: 'emp2' -> points to Heap Address B (id=102, name='Bob', salary=82000.0)");
        System.out.println(" - Stack: 'emp3' -> points to Heap Address C (id=103, name='Charlie', salary=68000.0)");
        System.out.println(" - All 3 Heap instances share access to the same static COMPANY_NAME in Method Area.");
    }
}

class EmployeeMemory {
    public static final String COMPANY_NAME = "TechCorp Global"; // Method Area / Metaspace
    private int id;       // Heap Memory (inside object instance)
    private String name;  // Heap Memory (reference inside object instance pointing to String pool / Heap)
    private double salary;// Heap Memory (inside object instance)

    public EmployeeMemory(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.printf("ID: %-4d | Name: %-10s | Salary: $%-9.2f | Company: %s%n", id, name, salary, COMPANY_NAME);
    }
}
