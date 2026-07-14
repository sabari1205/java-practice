/**
 * LeetCode 263: Ugly Number
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return true if n is an ugly number.
 */
public class Leetcode263 {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        
        int[] factors = {2, 3, 5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        return n == 1;
    }

    public static void main(String[] args) {
        int[] tests = {6, 1, 14, 0, -6};
        System.out.println("=== LeetCode 263: Ugly Number ===");
        for (int n : tests) {
            System.out.println("n = " + n + " -> is ugly? " + isUgly(n));
        }
    }
}
