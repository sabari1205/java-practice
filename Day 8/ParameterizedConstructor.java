class ParamEmployee {
    String name;
    int salary;

    ParamEmployee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        ParamEmployee e1 = new ParamEmployee("Amit", 50000);
        ParamEmployee e2 = new ParamEmployee("Sneha", 60000);
        e1.display();
        System.out.println();
        e2.display();
    }
}
