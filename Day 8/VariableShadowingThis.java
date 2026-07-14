public class VariableShadowingThis {
    public static void main(String[] args) {
        System.out.println("=== Variable Shadowing & Resolution using 'this' ===");
        ShadowDemo obj = new ShadowDemo(100, "Initial Name");
        obj.display();

        System.out.println("\nCalling method with shadowing parameters:");
        obj.updateValues(999, "Shadowed Name");
        obj.display();
    }
}

class ShadowDemo {
    private int value; // Instance variable
    private String name; // Instance variable

    public ShadowDemo(int value, String name) {
        // Here, parameter names 'value' and 'name' shadow the instance variables.
        // Without 'this.', assigning value = value would only assign parameter to itself!
        this.value = value;
        this.name = name;
    }

    public void updateValues(int value, String name) {
        System.out.println("[Inside updateValues] Parameter value: " + value + " shadows instance field this.value: " + this.value);
        
        // Resolving shadowing using 'this'
        this.value = value;
        this.name = name;
        System.out.println("[Inside updateValues] Successfully resolved shadowing and updated instance fields.");
    }

    public void display() {
        System.out.println("Current Instance Fields -> Value: " + this.value + ", Name: " + this.name);
    }
}
