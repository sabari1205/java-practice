public class UpcastingAnimalDog {
    public static void main(String[] args) {
        System.out.println("=== Upcasting Animal & Dog Demo ===");

        // Upcasting: Dog object assigned to Animal reference
        Animal myPet = new Dog("Buddy", "Golden Retriever");

        // Calling overridden method: runtime polymorphism resolves to Dog's implementation
        myPet.makeSound();
        myPet.eat();

        // Note: myPet.fetch() cannot be called directly because fetch() is not defined in Animal reference type!
        // To call fetch(), downcasting is required:
        if (myPet instanceof Dog) {
            Dog d = (Dog) myPet;
            d.fetch();
        }
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }

    public void eat() {
        System.out.println(name + " is eating food.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + breed + ") barks: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}
