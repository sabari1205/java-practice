public class MultilevelPersonEmployeeManager {
    public static void main(String[] args) {
        System.out.println("=== Multilevel Inheritance: Person -> Employee -> Manager ===");
        Manager mgr = new Manager("Michael Scott", 45, "EMP-001", 85000.0, "Regional Sales Branch");
        mgr.displayPersonInfo();
        mgr.displayEmployeeInfo();
        mgr.displayManagerInfo();
    }
}

class BasePerson {
    protected String name;
    protected int age;

    public BasePerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("[Constructor] BasePerson initialized.");
    }

    public void displayPersonInfo() {
        System.out.println("Person Name: " + name + " | Age: " + age);
    }
}

class BaseEmployee extends BasePerson {
    protected String empId;
    protected double baseSalary;

    public BaseEmployee(String name, int age, String empId, double baseSalary) {
        super(name, age);
        this.empId = empId;
        this.baseSalary = baseSalary;
        System.out.println("[Constructor] BaseEmployee initialized.");
    }

    public void displayEmployeeInfo() {
        System.out.printf("Employee ID: %s | Base Salary: $%.2f%n", empId, baseSalary);
    }
}

class Manager extends BaseEmployee {
    private String departmentManaged;

    public Manager(String name, int age, String empId, double baseSalary, String departmentManaged) {
        super(name, age, empId, baseSalary);
        this.departmentManaged = departmentManaged;
        System.out.println("[Constructor] Manager initialized.");
    }

    public void displayManagerInfo() {
        System.out.println("Managing Department: " + departmentManaged);
        System.out.printf("Total Compensation (with 20%% Manager Bonus): $%.2f%n", (baseSalary * 1.20));
    }
}
