import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Own Leetcode Choice - LeetCode 1: Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class LeetcodeOwnChoice {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = twoSum(nums, target);
        System.out.println("=== LeetCode Own Choice: Two Sum ===");
        System.out.println("Input Array: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Result Indices: " + Arrays.toString(result));
    }
}
