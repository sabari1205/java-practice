import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystemInheritance {
    public static void main(String[] args) {
        System.out.println("=== College Management System Using Inheritance ===");
        CollegeDepartment csDept = new CollegeDepartment("Computer Science & Engineering");

        Professor prof = new Professor("Dr. Alan Turing", 55, "EMP-101", "Artificial Intelligence", 110000);
        CollegeStudent s1 = new CollegeStudent("Grace Hopper", 21, "STU-501", "B.Tech CSE", 3.95);
        CollegeStudent s2 = new CollegeStudent("Linus Torvalds", 22, "STU-502", "B.Tech CSE", 3.88);

        csDept.addMember(prof);
        csDept.addMember(s1);
        csDept.addMember(s2);

        csDept.displayDepartmentMembers();
    }
}

class CollegeMember {
    protected String name;
    protected int age;

    public CollegeMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: General College Member");
    }
}

class Professor extends CollegeMember {
    private String staffId;
    private String specialization;
    private double salary;

    public Professor(String name, int age, String staffId, String specialization, double salary) {
        super(name, age);
        this.staffId = staffId;
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public void displayRole() {
        System.out.printf("[Professor] %s (ID: %s) | Specialization: %s | Salary: $%.2f%n", name, staffId, specialization, salary);
    }
}

class CollegeStudent extends CollegeMember {
    private String studentId;
    private String program;
    private double gpa;

    public CollegeStudent(String name, int age, String studentId, String program, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.program = program;
        this.gpa = gpa;
    }

    @Override
    public void displayRole() {
        System.out.printf("[Student]   %s (ID: %s) | Program: %-15s | GPA: %.2f%n", name, studentId, program, gpa);
    }
}

class CollegeDepartment {
    private String deptName;
    private List<CollegeMember> members;

    public CollegeDepartment(String deptName) {
        this.deptName = deptName;
        this.members = new ArrayList<>();
    }

    public void addMember(CollegeMember member) {
        members.add(member);
    }

    public void displayDepartmentMembers() {
        System.out.println("\n--- Department of " + deptName + " Members ---");
        for (CollegeMember m : members) {
            m.displayRole(); // Polymorphic call
        }
        System.out.println();
    }
}
