class PolyCalculation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class PolyAnimal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class PolyCat extends PolyAnimal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        PolyCalculation calc = new PolyCalculation();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));

        PolyAnimal myAnimal = new PolyAnimal();
        myAnimal.sound();

        PolyAnimal myCat = new PolyCat();
        myCat.sound();
    }
}
