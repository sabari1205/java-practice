/**
 * LeetCode 2481: Minimum Cuts to Divide a Circle
 * A valid cut in a circle can be:
 * - A cut that is represented by a straight line that touches two points on the boundary of the circle and passes through its center, or
 * - A cut that is represented by a straight line that touches one point on the boundary of the circle and its center.
 * Given the integer n, return the minimum number of cuts needed to divide a circle into n equal slices.
 */
public class Leetcode2481 {
    public static int numberOfCuts(int n) {
        if (n == 1) return 0;
        return (n % 2 == 0) ? n / 2 : n;
    }

    public static void main(String[] args) {
        int[] tests = {1, 2, 3, 4, 6};
        for (int n : tests) {
            System.out.println("n = " + n + " -> Minimum cuts: " + numberOfCuts(n));
        }
    }
}
