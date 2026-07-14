/**
 * LeetCode 1688: Count of Matches in Tournament
 * You are given an integer n, the number of teams in a tournament that has strange rules:
 * - If the current number of teams is even, each team gets paired with another team. Total matches = n / 2, and n / 2 teams advance.
 * - If the current number of teams is odd, one team randomly advances, and the rest get paired. Total matches = (n - 1) / 2.
 * Return the number of matches played in the tournament until a winner is decided.
 */
public class Leetcode1688 {
    public static int numberOfMatches(int n) {
        // Since each match eliminates exactly one team, n teams require n - 1 elimination matches.
        return n - 1;
    }

    public static void main(String[] args) {
        int[] tests = {7, 14, 2};
        System.out.println("=== LeetCode 1688: Count of Matches in Tournament ===");
        for (int n : tests) {
            System.out.println("Teams: " + n + " -> Matches played: " + numberOfMatches(n));
        }
    }
}
