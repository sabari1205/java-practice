import java.util.Arrays;

public class LeetcodeHackerrankArrayProblems {
    public static void main(String[] args) {
        System.out.println("=== LeetCode / HackerRank Array Problems Demo ===");
        
        // 1. LeetCode 283: Move Zeroes to the end while maintaining relative order
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original for Move Zeroes: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("After Move Zeroes: " + Arrays.toString(nums));
        
        System.out.println("----------------------------------------");
        
        // 2. HackerRank: Left Rotation of Array by d positions
        int[] hrArray = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.println("Original for Left Rotation: " + Arrays.toString(hrArray) + ", d = " + d);
        int[] rotated = leftRotate(hrArray, d);
        System.out.println("After Left Rotation: " + Arrays.toString(rotated));
    }

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static int[] leftRotate(int[] arr, int d) {
        int n = arr.length;
        int[] result = new int[n];
        d = d % n;
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + d) % n];
        }
        return result;
    }
}
