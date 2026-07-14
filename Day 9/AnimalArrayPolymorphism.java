public class AnimalArrayPolymorphism {
    public static void main(String[] args) {
        System.out.println("=== Storing Multiple Animal Objects in an Array (Polymorphism) ===");
        
        PolyAnimal[] zoo = {
            new PolyLion("Simba"),
            new PolyElephant("Dumbo"),
            new PolyMonkey("George"),
            new PolyLion("Mufasa")
        };

        for (PolyAnimal animal : zoo) {
            animal.makeSound(); // Runtime Polymorphism
            animal.eat();
            System.out.println("----------------------------------------");
        }
    }
}

abstract class PolyAnimal {
    protected String name;

    public PolyAnimal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public abstract void eat();
}

class PolyLion extends PolyAnimal {
    public PolyLion(String name) { super(name); }

    @Override
    public void makeSound() { System.out.println("[Lion] " + name + " roars fiercely: ROAAAR!"); }

    @Override
    public void eat() { System.out.println("[Lion] " + name + " is eating meat."); }
}

class PolyElephant extends PolyAnimal {
    public PolyElephant(String name) { super(name); }

    @Override
    public void makeSound() { System.out.println("[Elephant] " + name + " trumpets loudly!"); }

    @Override
    public void eat() { System.out.println("[Elephant] " + name + " is eating grass and bananas."); }
}

class PolyMonkey extends PolyAnimal {
    public PolyMonkey(String name) { super(name); }

    @Override
    public void makeSound() { System.out.println("[Monkey] " + name + " chatters: Ooh Ooh Aah Aah!"); }

    @Override
    public void eat() { System.out.println("[Monkey] " + name + " is peeling a banana."); }
}
