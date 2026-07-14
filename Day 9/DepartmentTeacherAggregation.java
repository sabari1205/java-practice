import java.util.ArrayList;
import java.util.List;

public class DepartmentTeacherAggregation {
    public static void main(String[] args) {
        System.out.println("=== Aggregation Demo: Department has-a Teacher (Weak Ownership) ===");

        // Teachers exist independently outside any single department
        Teacher t1 = new Teacher("T-101", "Ms. Valerie Frizzle", "Biology");
        Teacher t2 = new Teacher("T-102", "Mr. Walter White", "Chemistry");
        Teacher t3 = new Teacher("T-103", "Dr. Henry Jones", "Archaeology & History");

        Department dept = new Department("Science & Humanities");
        dept.addTeacher(t1);
        dept.addTeacher(t2);
        dept.addTeacher(t3);

        dept.displayDepartment();

        System.out.println("\nEven if the Department is dissolved, Teacher objects remain active:");
        dept = null; // Department removed
        System.out.println("Teacher t2 independent check: " + t2.getName() + " teaching " + t2.getSubject());
    }
}

class Teacher {
    private String id;
    private String name;
    private String subject;

    public Teacher(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String getName() { return name; }
    public String getSubject() { return subject; }

    public void display() {
        System.out.printf("  * [%s] %-20s | Subject: %s%n", id, name, subject);
    }
}

class Department {
    private String deptName;
    private List<Teacher> teachers; // Aggregation: references existing Teacher objects

    public Department(String deptName) {
        this.deptName = deptName;
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        System.out.println("Assigned Teachers:");
        for (Teacher t : teachers) {
            t.display();
        }
    }
}
