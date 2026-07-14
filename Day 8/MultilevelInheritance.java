class MultiGrandFather {
    void showGrandFather() {
        System.out.println("I am GrandFather");
    }
}

class MultiFather extends MultiGrandFather {
    void showFather() {
        System.out.println("I am Father");
    }
}

class MultiSon extends MultiFather {
    void showSon() {
        System.out.println("I am Son");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        MultiSon s = new MultiSon();
        s.showGrandFather();
        s.showFather();
        s.showSon();
    }
}
