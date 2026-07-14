public class StudentThreeDetails {
    public static void main(String[] args) {
        System.out.println("=== Three Students Details Demo ===");
        StudentDemo s1 = new StudentDemo(1, "Alice Johnson", 88.5);
        StudentDemo s2 = new StudentDemo(2, "Bob Smith", 92.0);
        StudentDemo s3 = new StudentDemo(3, "Charlie Brown", 79.5);

        s1.display();
        s2.display();
        s3.display();
    }
}

class StudentDemo {
    private int rollNo;
    private String name;
    private double marks;

    public StudentDemo(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.printf("Roll No: %-3d | Name: %-15s | Marks: %.1f%n", rollNo, name, marks);
    }
}
