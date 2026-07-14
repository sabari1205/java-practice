import java.util.Arrays;

public class SumAccumulation {
    public static void main(String[] args) {
        int[] numbers = {15, 25, 35, 45, 55};
        
        int totalSum = 0;
        int runningSum = 0;
        
        System.out.println("=== Array Sum Accumulation Demo ===");
        System.out.println("Array Elements: " + Arrays.toString(numbers));
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
            runningSum += numbers[i];
            System.out.printf("After adding element [%d] (%d), Running Sum = %d%n", i, numbers[i], runningSum);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total Accumulated Sum: " + totalSum);
    }
}
