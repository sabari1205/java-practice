import java.util.Arrays;

public class FindTargetElement {
    public static void main(String[] args) {
        int[] data = {14, 25, 36, 47, 58, 69, 80};
        int target = 47;

        System.out.println("=== Find Target Element in Array ===");
        System.out.println("Array: " + Arrays.toString(data));
        System.out.println("Target: " + target);

        // Linear Search
        int linearIndex = linearSearch(data, target);
        System.out.println("Linear Search Index: " + linearIndex);

        // Binary Search (Array must be sorted)
        int binaryIndex = Arrays.binarySearch(data, target);
        System.out.println("Binary Search Index: " + binaryIndex);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
