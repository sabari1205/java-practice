class ConstructorStudent {
    String name;
    int rollNo;

    ConstructorStudent() {
        name = "Unknown";
        rollNo = 0;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

class ConstructorEmployee {
    String name;
    double salary;

    ConstructorEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

class ConstructorCar {
    String brand;
    int year;

    ConstructorCar(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    ConstructorCar(ConstructorCar other) {
        this.brand = other.brand;
        this.year = other.year;
    }

    void display() {
        System.out.println("Car: " + brand + " (" + year + ")");
    }
}

public class TypesOfConstructors {
    public static void main(String[] args) {

        System.out.println("1. Default Constructor");
        ConstructorStudent s1 = new ConstructorStudent();
        s1.display();

        System.out.println("\n2. Parameterized Constructor");
        ConstructorEmployee e1 = new ConstructorEmployee("Varun", 75000);
        ConstructorEmployee e2 = new ConstructorEmployee("Rahul", 60000);
        e1.display();
        e2.display();

        System.out.println("\n3. Copy Constructor");
        ConstructorCar c1 = new ConstructorCar("Toyota", 2025);
        ConstructorCar c2 = new ConstructorCar(c1);
        c1.display();
        c2.display();
    }
}
