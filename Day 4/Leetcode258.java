/**
 * LeetCode 258: Add Digits
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 */
public class Leetcode258 {
    public static int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        int[] tests = {38, 0, 12345, 99};
        System.out.println("=== LeetCode 258: Add Digits ===");
        for (int n : tests) {
            System.out.println("num = " + n + " -> Digital root: " + addDigits(n));
        }
    }
}
