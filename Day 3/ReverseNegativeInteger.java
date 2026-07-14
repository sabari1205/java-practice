public class ReverseNegativeInteger {
    public static void main(String[] args) {
        int[] negatives = {-456, -9876, -100, -12345};

        System.out.println("=== Reversing Negative Integers ===");
        for (int num : negatives) {
            System.out.println("Original: " + num + " -> Reversed: " + reverseNegative(num));
        }
    }

    public static int reverseNegative(int num) {
        if (num >= 0) {
            System.out.println("Warning: Expected a negative number, but got positive.");
        }
        
        boolean isNegative = num < 0;
        int absVal = Math.abs(num);
        int reversed = 0;
        
        while (absVal > 0) {
            int digit = absVal % 10;
            reversed = reversed * 10 + digit;
            absVal /= 10;
        }
        
        return isNegative ? -reversed : reversed;
    }
}
