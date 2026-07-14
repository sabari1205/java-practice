/**
 * LeetCode 9: Palindrome Number
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class Leetcode9 {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 10, 1221};
        System.out.println("=== LeetCode 9: Palindrome Number ===");
        for (int num : testCases) {
            System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
        }
    }
}
