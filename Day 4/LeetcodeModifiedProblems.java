import java.util.Arrays;

public class LeetcodeModifiedProblems {
    public static void main(String[] args) {
        System.out.println("=== LeetCode Similar & Modified Problems Demo ===");
        
        // Problem 1: Two Sum II - Input Array Is Sorted (Modified Two Sum using Two Pointers)
        int[] sortedNumbers = {2, 7, 11, 15};
        int target = 18;
        System.out.println("Sorted Two Sum for array " + Arrays.toString(sortedNumbers) + " with target " + target + ": " 
                           + Arrays.toString(twoSumSorted(sortedNumbers, target)));
                           
        // Problem 2: Modified FizzBuzz (Custom divisibility rules)
        System.out.println("\nModified FizzBuzz (Divisible by 2 -> 'Ping', Divisible by 3 -> 'Pong'):");
        for (int i = 1; i <= 6; i++) {
            System.out.println(i + " -> " + modifiedFizzBuzz(i));
        }
    }

    public static int[] twoSumSorted(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-indexed as in LeetCode 167
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static String modifiedFizzBuzz(int n) {
        if (n % 6 == 0) return "PingPong";
        if (n % 2 == 0) return "Ping";
        if (n % 3 == 0) return "Pong";
        return String.valueOf(n);
    }
}
