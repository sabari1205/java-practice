public class NumberReversing {
    public static void main(String[] args) {
        int number = 987654321;
        
        System.out.println("=== Number Reversing Techniques ===");
        System.out.println("Original Number: " + number);
        System.out.println("Reversed (Loop): " + reverseIterative(number));
        System.out.println("Reversed (Recursive): " + reverseRecursive(number, 0));
    }

    public static int reverseIterative(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    public static int reverseRecursive(int num, int rev) {
        if (num == 0) return rev;
        return reverseRecursive(num / 10, rev * 10 + (num % 10));
    }
}
