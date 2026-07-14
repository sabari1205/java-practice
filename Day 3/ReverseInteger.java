public class ReverseInteger {
    public static int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reversed = reversed * 10 + pop;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0; // Overflow occurred
            }
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        int[] testCases = {123, -123, 120, 0, 1534236469};
        System.out.println("=== Reverse Integer Demo ===");
        for (int num : testCases) {
            System.out.println("Original: " + num + " -> Reversed: " + reverse(num));
        }
    }
}
