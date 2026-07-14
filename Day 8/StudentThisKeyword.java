public class StudentThisKeyword {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating 'this' keyword in Student Class ===");
        StudentThis s = new StudentThis(101, "David Beckham", "Sports Science");
        s.display();
        s.updateMajor("Physical Education");
    }
}

class StudentThis {
    private int id;
    private String name;
    private String major;

    public StudentThis(int id, String name, String major) {
        // 'this' distinguishes instance variables from parameters with the exact same names
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public void updateMajor(String major) {
        System.out.println("Updating major for " + this.name + " from " + this.major + " to " + major);
        this.major = major; // using 'this' to assign to instance field
        this.display();     // using 'this' to invoke current class method
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Major: %s%n", this.id, this.name, this.major);
    }
}
