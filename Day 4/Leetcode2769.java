/**
 * LeetCode 2769: Find the Maximum Achievable Number
 * Given two integers, num and t. An integer x is called achievable if it can become equal to num after applying the following operation at most t times:
 * - Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
 * Return the maximum possible achievable number.
 */
public class Leetcode2769 {
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        System.out.println("=== LeetCode 2769: Find the Maximum Achievable Number ===");
        System.out.println("num = 4, t = 1 -> Max Achievable: " + theMaximumAchievableX(4, 1));
        System.out.println("num = 3, t = 2 -> Max Achievable: " + theMaximumAchievableX(3, 2));
    }
}
