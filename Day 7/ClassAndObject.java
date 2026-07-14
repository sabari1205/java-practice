class BasicStudent {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        BasicStudent s = new BasicStudent();
        s.name = "Rahul";
        s.rollNo = 101;
        s.display();
    }
}
