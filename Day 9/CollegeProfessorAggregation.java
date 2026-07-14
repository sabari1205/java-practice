import java.util.ArrayList;
import java.util.List;

public class CollegeProfessorAggregation {
    public static void main(String[] args) {
        System.out.println("=== Aggregation Demo: College has-a Professor (Weak Lifecycle Dependency) ===");

        // Professors created independently
        AggProfessor p1 = new AggProfessor("P101", "Dr. Richard Feynman", "Quantum Physics");
        AggProfessor p2 = new AggProfessor("P102", "Dr. John von Neumann", "Applied Mathematics");
        AggProfessor p3 = new AggProfessor("P103", "Dr. Ada Lovelace", "Computing Algorithms");

        CollegeAgg college = new CollegeAgg("Institute of Advanced Study");
        college.addProfessor(p1);
        college.addProfessor(p2);
        college.addProfessor(p3);

        college.displayFaculty();

        System.out.println("\nEven if College object is dissolved/deleted, Professor objects continue to exist in memory:");
        college = null; // College object dissolved
        System.out.println("Independent access to Professor p1 -> " + p1.getName() + " (" + p1.getSubject() + ")");
    }
}

class AggProfessor {
    private String id;
    private String name;
    private String subject;

    public AggProfessor(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public String getName() { return name; }
    public String getSubject() { return subject; }

    public void display() {
        System.out.printf(" - [%s] %-22s | Specialization: %s%n", id, name, subject);
    }
}

class CollegeAgg {
    private String name;
    private List<AggProfessor> faculty; // Aggregation: College references existing Professors

    public CollegeAgg(String name) {
        this.name = name;
        this.faculty = new ArrayList<>();
    }

    public void addProfessor(AggProfessor prof) {
        faculty.add(prof);
    }

    public void displayFaculty() {
        System.out.println("Faculty List of " + name + ":");
        for (AggProfessor p : faculty) {
            p.display();
        }
    }
}
