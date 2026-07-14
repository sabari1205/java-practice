public class CountDigits {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 123, -98765, 1000000};

        System.out.println("=== Count Digits in an Integer ===");
        for (int num : numbers) {
            System.out.println("Number: " + num + " -> Digit count: " + countDigits(num));
        }
    }

    public static int countDigits(int num) {
        if (num == 0) return 1;
        
        int count = 0;
        int absVal = Math.abs(num);
        
        while (absVal > 0) {
            count++;
            absVal /= 10;
        }
        
        return count;
    }
}
