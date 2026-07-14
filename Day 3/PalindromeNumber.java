public class PalindromeNumber {
    public static void main(String[] args) {
        int[] numbers = {121, 12321, 12345, 4554, 7, -121};

        System.out.println("=== Palindrome Number Checker ===");
        for (int num : numbers) {
            System.out.println("Number: " + num + " -> Is Palindrome? " + checkPalindrome(num));
        }
    }

    public static boolean checkPalindrome(int num) {
        if (num < 0) return false;
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
}
