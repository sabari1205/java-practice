import java.util.Arrays;

public class ScenarioBasedHiddenLogic {
    public static void main(String[] args) {
        System.out.println("=== Scenario Based Hidden Logic Problem ===");
        
        // Scenario: A sensor transmits a sequence of distinct timestamps from 0 to N. One timestamp was lost due to network glitch. Find the missing timestamp.
        int[] sensorLogs = {3, 0, 1, 4, 6, 2, 7, 8, 9}; // 5 is missing from 0..9
        System.out.println("Received Logs: " + Arrays.toString(sensorLogs));
        System.out.println("Missing Timestamp (Hidden Logic - Sum Formula): " + findMissingNumber(sensorLogs));
        
        // Scenario 2: Check if stock price trend is strictly monotonic (increasing or decreasing)
        int[] stockPrices = {100, 105, 110, 115, 120};
        System.out.println("Stock Prices: " + Arrays.toString(stockPrices) + " -> Is Monotonic Trend? " + isMonotonic(stockPrices));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) inc = false;
            if (nums[i] > nums[i - 1]) dec = false;
        }
        return inc || dec;
    }
}
