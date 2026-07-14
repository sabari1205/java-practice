import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArrayProblem {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 5, 10, 20};

        System.out.println("=== Frequency Array Problem ===");
        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("--------------------------------");

        // Method 1: Using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " -> Frequency: " + entry.getValue());
        }
    }
}
