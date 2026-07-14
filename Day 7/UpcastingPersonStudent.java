public class UpcastingPersonStudent {
    public static void main(String[] args) {
        System.out.println("=== Upcasting & Method Overriding Demo ===");
        
        // Upcasting: Subclass object assigned to Superclass reference variable
        Person p = new Student("Alice", 20, "Computer Science");
        
        // Even though p is of type Person, runtime polymorphism invokes the overridden method in Student
        p.displayRole();
        p.introduce();
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: University Student (Major: " + major + ")");
    }
}
