import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElementWithMostOccurrence {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 4, 2, 5, 4, 6, 4};

        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequentElement = arr[0];

        for (int num : arr) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = num;
            }
        }

        System.out.println("=== Find Element with Most Occurrence ===");
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Most Frequent Element: " + mostFrequentElement + " (occurred " + maxCount + " times)");
    }
}
