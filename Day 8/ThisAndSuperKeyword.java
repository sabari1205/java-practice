class KeywordParent {
    String name;

    KeywordParent(String name) {
        this.name = name;
        System.out.println("Parent Constructor: " + this.name);
    }

    void display() {
        System.out.println("Parent Name: " + name);
    }
}

class KeywordChild extends KeywordParent {
    String childName;

    KeywordChild(String parentName, String childName) {
        super(parentName);
        this.childName = childName;
        System.out.println("Child Constructor: " + this.childName);
    }

    void display() {
        super.display();
        System.out.println("Child Name: " + childName);
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        KeywordChild c = new KeywordChild("Ramesh", "Suresh");
        System.out.println();
        c.display();
    }
}
