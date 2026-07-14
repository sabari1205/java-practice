import java.util.ArrayList;
import java.util.List;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== School Management System Using Inheritance ===");
        School school = new School("Greenwood High School");

        SchoolTeacher t1 = new SchoolTeacher("Mr. Albus Dumbledore", 65, "EMP-901", "Transfiguration & Leadership", 85000);
        SchoolTeacher t2 = new SchoolTeacher("Prof. Minerva McGonagall", 58, "EMP-902", "Mathematics & Logic", 78000);

        SchoolStudent s1 = new SchoolStudent("Harry Potter", 16, "STU-001", "10th Grade", 'A');
        SchoolStudent s2 = new SchoolStudent("Hermione Granger", 16, "STU-002", "10th Grade", 'A');
        SchoolStudent s3 = new SchoolStudent("Ron Weasley", 16, "STU-003", "10th Grade", 'B');

        school.addMember(t1);
        school.addMember(t2);
        school.addMember(s1);
        school.addMember(s2);
        school.addMember(s3);

        school.displayAllMembers();
    }
}

class SchoolMember {
    protected String name;
    protected int age;

    public SchoolMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: School Member");
    }
}

class SchoolTeacher extends SchoolMember {
    private String employeeId;
    private String subject;
    private double salary;

    public SchoolTeacher(String name, int age, String employeeId, String subject, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayRole() {
        System.out.printf("[Teacher] %-22s (ID: %s) | Subject: %-26s | Salary: $%.2f%n", name, employeeId, subject, salary);
    }
}

class SchoolStudent extends SchoolMember {
    private String studentId;
    private String gradeLevel;
    private char section;

    public SchoolStudent(String name, int age, String studentId, String gradeLevel, char section) {
        super(name, age);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.section = section;
    }

    @Override
    public void displayRole() {
        System.out.printf("[Student] %-22s (ID: %s) | Grade: %-12s | Section: %c%n", name, studentId, gradeLevel, section);
    }
}

class School {
    private String schoolName;
    private List<SchoolMember> members;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.members = new ArrayList<>();
    }

    public void addMember(SchoolMember member) {
        members.add(member);
    }

    public void displayAllMembers() {
        System.out.println("\n--- Directory for " + schoolName + " ---");
        for (SchoolMember m : members) {
            m.displayRole(); // Polymorphic method call
        }
        System.out.println();
    }
}
