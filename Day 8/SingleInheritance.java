class SingleAnimal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class SingleDog extends SingleAnimal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        SingleDog d = new SingleDog();
        d.eat();
        d.bark();
    }
}
