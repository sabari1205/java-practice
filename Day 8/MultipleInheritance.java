interface MultiPrintable {
    void print();
}

interface MultiShowable {
    void show();
}

class MultiDocument implements MultiPrintable, MultiShowable {
    public void print() {
        System.out.println("Printing document");
    }
    
    public void show() {
        System.out.println("Showing document");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MultiDocument doc = new MultiDocument();
        doc.print();
        doc.show();
    }
}
