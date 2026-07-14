public class PersonEmployeeInheritance {
    public static void main(String[] args) {
        System.out.println("=== Person & Employee Inheritance Demo ===");
        EmployeeInherit emp = new EmployeeInherit("EMP-808", "Sarah Connor", 35, "Cybernetics", 95000.00);
        emp.displayPersonInfo();
        emp.displayEmployeeInfo();
    }
}

class PersonInherit {
    protected String name;
    protected int age;

    public PersonInherit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Person Name: " + name + " | Age: " + age);
    }
}

class EmployeeInherit extends PersonInherit {
    private String employeeId;
    private String department;
    private double salary;

    public EmployeeInherit(String employeeId, String name, int age, String department, double salary) {
        super(name, age); // Invoking Person constructor
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("--- Employee Details ---");
        System.out.println("Emp ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}
