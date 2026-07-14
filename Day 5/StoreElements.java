import java.util.Arrays;

public class StoreElements {
    public static void main(String[] args) {
        // Storing elements in an array dynamically using loops
        int size = 10;
        int[] evenNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }
        
        System.out.println("=== Storing Elements in Array Demo ===");
        System.out.println("Stored Even Numbers: " + Arrays.toString(evenNumbers));
    }
}
