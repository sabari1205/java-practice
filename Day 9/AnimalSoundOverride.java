public class AnimalSoundOverride {
    public static void main(String[] args) {
        System.out.println("=== Overriding sound() Method in Dog and Cat Classes ===");
        SoundAnimal generic = new SoundAnimal("Generic Animal");
        SoundAnimal dog = new SoundDog("Rex");
        SoundAnimal cat = new SoundCat("Whiskers");

        generic.sound();
        dog.sound();
        cat.sound();
    }
}

class SoundAnimal {
    protected String name;

    public SoundAnimal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " makes a generic sound.");
    }
}

class SoundDog extends SoundAnimal {
    public SoundDog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " (Dog) barks: Woof! Woof!");
    }
}

class SoundCat extends SoundAnimal {
    public SoundCat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " (Cat) meows: Meow! Meow!");
    }
}
