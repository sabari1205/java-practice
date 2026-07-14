/**
 * LeetCode 2119: Check if an Integer Is Palindrome After Double Reversal
 * Reversing an integer means to reverse all its digits.
 * For example, reversing 2021 gives 1202. Reversing 1200 gives 21 as the leading zeros are not retained.
 * Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2.
 * Return true if reversed2 equals num. Otherwise return false.
 */
public class Leetcode2119 {
    public static boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

    public static void main(String[] args) {
        int test1 = 526;
        int test2 = 1800;
        int test3 = 0;

        System.out.println("num = " + test1 + " -> " + isSameAfterReversals(test1));
        System.out.println("num = " + test2 + " -> " + isSameAfterReversals(test2));
        System.out.println("num = " + test3 + " -> " + isSameAfterReversals(test3));
    }
}
