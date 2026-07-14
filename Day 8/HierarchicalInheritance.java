class HierarchicalShape {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class HierarchicalCircle extends HierarchicalShape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class HierarchicalRectangle extends HierarchicalShape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class HierarchicalTriangle extends HierarchicalShape {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        HierarchicalCircle c = new HierarchicalCircle();
        HierarchicalRectangle r = new HierarchicalRectangle();
        HierarchicalTriangle t = new HierarchicalTriangle();
        c.draw();
        r.draw();
        t.draw();
    }
}
