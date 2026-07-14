class CastingParent {
    void display() {
        System.out.println("Parent display");
    }
}

class CastingChild extends CastingParent {
    void display() {
        System.out.println("Child display");
    }
    
    void show() {
        System.out.println("Child show");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        CastingParent p = new CastingChild();
        p.display();
        
        CastingChild c = (CastingChild) p;
        c.display();
        c.show();
    }
}
